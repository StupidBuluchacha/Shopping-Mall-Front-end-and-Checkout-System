if (window.console) {
  console.log("Welcome to your Play application's JavaScript!")
}

window.onload = () => {
  const toProducts = document.getElementById('toProducts')
  toProducts.addEventListener('click', (e) => {
    e.preventDefault()
    window.location.assign('products')
  })
  const toHome = document.getElementById('toHome')
  toHome.addEventListener('click', (e) => {
    e.preventDefault()
    window.location.assign('/')
  })
  const toCart = document.getElementById('toCart')
  toCart.addEventListener('click', (e) => {
    e.preventDefault()
    window.location.assign('cart')
  })

  // update subTotPrice, totPrice
  function updatePrice() {
    let totalPrice = 0
    const numArr = document.getElementsByClassName('number')
    const priceArr = [50.0, 30.0, 70.0]
    const subTotalArr = document.getElementsByClassName('subTotal')
    for (let i = 0; i < 3; i++) {
      const subTotPrice = (numArr[i].value * priceArr[i]).toFixed(2)
      subTotalArr[i].innerHTML = '$' + subTotPrice
      totalPrice += parseFloat(subTotPrice)
    }

    const totalPriEle = document.getElementById('totalPrice')
    if (totalPrice >= 300 && totalPrice <= 450) {
      totalPrice *= 0.7
      totalPriEle.innerHTML = '$' + parseFloat(totalPrice).toFixed(2) + '(30% off!)'
    } else if (totalPrice > 450) {
      totalPrice *= 0.65
      totalPriEle.innerHTML = '$' + parseFloat(totalPrice).toFixed(2) + '(35% off!)'
    } else {
      totalPriEle.innerHTML = '$' + parseFloat(totalPrice).toFixed(2)
    }
  }
  if (location.href === 'http://localhost:9000/cart') {
    const inpArr = document.getElementsByClassName('number')
    for (let i = 0; i < 3; i++) {
      inpArr[i].addEventListener('change', () => {
        updatePrice()
      })
    }
  }

  if (location.href === 'http://localhost:9000/products') {
    const product1 = document.getElementById('product1')
    product1.addEventListener('click', () => {
      window.location.assign('productsDetails')
    })
  }
}

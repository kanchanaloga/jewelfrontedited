<html>
<head> 
<title>Shopping Dac Jewellery </title>
<meta charset="utf-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  </head>
<body>
<header>
<jsp:include page="header.jsp"></jsp:include>
</header>
<br/>
<br/>
<br/>
<div   style="position:absolute;" >
<br/>
<br/>

</div>
<div class="container">
  
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="./resources/images/main1.jpg" data-slide-to="0" class="active"></li>
      <li data-target="./resources/images/main11.jpg" data-slide-to="1"></li>
      <li data-target="./resources/images/main10.jpg" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <img src="./resources/images/main1.jpg" alt="collections" style="width:100%;">
      </div>

      <div class="item">
        <img src="./resources/images/main10.jpg" alt="necklase" style="width:100%;">
      </div>
    
      <div class="item">
        <img src="./resources/images/main11.jpg" alt="ring" style="width:100%;">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>

<div class="container">
  <h2>Jewells Gallery</h2>
  <div class="row">
    <div class="col-md-4">
      <div class="thumbnail">
        <a href="productDetails" target="_blank">
          <img src="./resources/images/neck12.jpg" href="productDetails" alt="Lights" style="width:100%">
          <div class="caption">
            <p>Model 1:  price.</p>
          </div>
        </a>
      </div>
    </div>
    <div class="col-md-4">
      <div class="thumbnail">
        <a href="/w3images/nature.jpg" target="_blank">
          <img src="./resources/images/necka.jpg" alt="Nature" style="width:100%">
          <div class="caption">
            <p>model 2:   price</p>
          </div>
        </a>
      </div>
    </div>
    <div class="col-md-4">
      <div class="thumbnail">
        <a href="/w3images/fjords.jpg" target="_blank">
          <img src="./resources/images/neck0.jpg" alt="Fjords" style="width:100%">
          <div class="caption">
            <p>model 3:    price:</p>
          </div>
        </a>
      </div>
    </div>
  </div>
</div>

<footer>
<jsp:include page="footer.jsp"></jsp:include>

</footer>


</body>
</html>

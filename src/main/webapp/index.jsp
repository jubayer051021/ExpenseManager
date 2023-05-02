<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js" integrity="sha384-zYPOMqeu1DAVkHiLqWBUTcbYfZ8osu1Nd6Z89ify25QV9guujx43ITvfi12/QExE" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js" integrity="sha384-Y4oOpwW3duJdCWv5ly8SCFYWqFDsfob/3GkgExXKV4idmbt98QcxXYs9UoXAB7BZ" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
  </head>
   <body>
      <Container class="">
          <form action="ExpenseManager" method="post"  class="w-50 mx-auto border border-4 mt-5 p-4 border border-rounded rounded">
              <h2 class="text-center">Expense Manager</h2>
              <div class="mb-3">
                <label for="ename" class="form-label fw-medium">User Name:</label>
                <input type="text" class="form-control" id="ename" placeholder="Username" name="ename" >
              </div>
              <div class="mb-3">
                <label for="date" class="form-label fw-medium">Date:</label>
                <input type="date" class="form-control" id="date" name="date">
              </div>
                <div class="">
                  <label for="exampleInputPassword1" class="form-label fw-medium">Expense Category:</label>
                  <select name="category" id="category" class="btn border border-2">
                      <option value="Transportation">Transportation</option>
                      <option value="Food">Food</option>
                      <option value="Fees">Fees</option>
                      <option value="Bills">Bills</option>
                      <option value="Entertainment">Entertainment</option>
                  </select>

                </div>

                <div class="mb-3">
                  <label for="des" class="form-label fw-medium">Description:</label>
                  <textarea type="" class="form-control" id="des" name="des" rows="4" cols="50" placeholder="Description of this Expense"></textarea>
                </div>
                <div class="mb-3">
                  <label for="amount" class="form-label fw-medium">Amount:</label>
                  <input type="text" class="form-control" id="amount" name="amount" placeholder="Enter the Amount">
                </div>
                  <button type="submit" class="btn btn-primary">Submit</button>

              </form>
              <form action="viewAll" method="get"class="w-50 mx-auto  ps-4" >
                  <button type="submit"  class="btn btn-primary">View all</button>
             </form>
      </Container>
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
    </body>
</html>
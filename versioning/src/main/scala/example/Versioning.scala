package example

object Versioning {
  /**
   * @api {get} /user/:id Get User information and Date of Registration.
   * @apiVersion 0.2.0
   * @apiName GetUser
   * @apiGroup User
   *
   * @apiParam {Number} id Users unique ID.
   *
   * @apiSuccess {String} firstname  Firstname of the User.
   * @apiSuccess {String} lastname   Lastname of the User.
   * @apiSuccess {Date}   registered Date of Registration.
   *
   * @apiSuccessExample Success-Response:
   *     HTTP/1.1 200 OK
   *     {
   *       "firstname": "John",
   *       "lastname": "Doe"
   *     }
   *
   * @apiError UserNotFound The id of the User was not found.
   *
   * @apiErrorExample Error-Response:
   *     HTTP/1.1 404 Not Found
   *     {
   *       "error": "UserNotFound"
   *     }
   */
  def getUser() = ???
}




package jp.t2v.lab.play2.auth

trait IdContainer[AuthId] {

  def startNewSession(userId: AuthId, timeoutInSeconds: Int): AuthenticityToken

  def remove(token: AuthenticityToken): Unit
  def get(token: AuthenticityToken): Option[AuthId]

  def prolongTimeout(token: AuthenticityToken, timeoutInSeconds: Int): Unit

}

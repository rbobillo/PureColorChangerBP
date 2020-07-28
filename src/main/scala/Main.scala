import cats.effect.{ExitCode, IO, IOApp}
import cats.implicits._

object Main extends IOApp {

  def run(av: List[String]): IO[ExitCode] = IO.pure(ExitCode.Success)

}

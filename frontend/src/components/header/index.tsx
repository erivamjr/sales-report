import logo from '../../assets/img/logo.svg'
import './styles.css'
function Header() {
  return (
    <header>
      <div className="dsmeta-logo-container">
        <img src={logo} alt="DSMeta" />
        <h1>DSMeta</h1>
        <a href="">Desenvolvido por José Erivam</a>
      </div>
    </header>
  )
}

export default Header;
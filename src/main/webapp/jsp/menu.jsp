<nav class="navbar navbar-expand-sm navbar-dark bg-dark" aria-label="Third navbar example">
  <div class="container-fluid">
    <a class="navbar-brand" href="/">Atomic Web</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarsExample03" aria-controls="navbarsExample03" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarsExample03">
      <ul class="navbar-nav me-auto mb-2 mb-sm-0">
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="dropdown03" data-bs-toggle="dropdown" aria-expanded="false">Cadastro</a>
          <ul class="dropdown-menu" aria-labelledby="dropdown03">
            <li><a class="dropdown-item" href="/conta">Conta</a></li>
            <li><a class="dropdown-item" href="/usuario">Usuário</a></li>
          </ul>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="dropdown03" data-bs-toggle="dropdown" aria-expanded="false">Financeiro</a>
          <ul class="dropdown-menu" aria-labelledby="dropdown03">
            <li><a class="dropdown-item" href="/lancamento">Lançamento</a></li>
            <li><a class="dropdown-item" href="/agendamentos">Agendamento</a></li>
            <li><a class="dropdown-item" href="/rotina">Rotina</a></li>
          </ul>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/" ng-click="sair()">Sair</a>
        </li>

      </ul>
    </div>
  </div>
</nav>

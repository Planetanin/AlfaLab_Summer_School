public class Amigo {

    private boolean installed;

          Amigo(boolean installed) {
                this.installed = installed;
            }

            public void setInstalled(boolean installed) {
                this.installed = installed;
            }

           public boolean isInstalled() {
                return installed;
            }

           public void Install() {
                setInstalled(true);
            }

            public void Uninstall() {
                setInstalled(false);
            }

            public void Reinstall() {
                if (this.isInstalled()) {
                        this.Uninstall();
                        this.Install();
                    }
                else {
                       this.Install();
                    }
            }
    public void Run() throws AmigoException {
                System.out.println("Вас приветствует браузер Амиго.");
                throw new AmigoException("Внезапный краш приложения. Просто потому что никто не должен запускать это.");
            }
}


}

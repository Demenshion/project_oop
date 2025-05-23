git config --global user.name "Demenshion" - добавление в git имя пользователя GitHub
git config --global user.email "dmegorov2003@gmail.com" - добавление в git почты пользователя GitHub
cd /d H: - прейти на дргой диск H 
cd H:\Work\Study\Institute\OOP\Project - пройти по пути который нам нужен, чтобы в дальнейшем добавить в Git
git init - подключить к каталогу Git
git config --global --add safe.directory H:/Work/Study/Institute/OOP/Project - провести операцию по безопасному подключение к GitHub
git remote add origin https://github.com/Demenshion/project_oop.git - подключение репозитория к Git
git clone https://github.com/Demenshion/project_oop.git - клонирование репозитория к Git 
dir - проверка содержимого каталога
git status - проверка не добавленных к коммиту файлов и каталогов
git add. или git add README.md - добавление полное или выборочно файлов к коммиту
git commit -m "комент" - проведение "чек поинта" сохранения в локальном коммите файлов и каталогов
git log - показывает историю всех коммитов в данной ветке с их хэшами и сообщениями в хронологическом порядке
git checkout 042f7bdd7cd5b2e7d15bb2a69408179840c333a7 - возращение в коммите к тому состоянию который нужно пользователю
git push origin(имя репозитория url или под кодовым origin) master(ветка) - публикует коммиты из локального репозитория в удалённый с данным именем в данной его ветке
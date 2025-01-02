def gitdownload(repo)
{
  git "https://github.com/sudarshansw7/${repo}.git"
}
def gitbuild()
{
  sh 'mvn package'
}

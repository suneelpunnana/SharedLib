println(args[0])

String job=args[0].toString()

println("${job}")





definition{
cpsScm {
scm {
        git {
            remote {
                name('origin')
                url('https://github.com/maheedhar132/Devops_assesment.git')
            }
              
        }
    }
  }
triggers {
        cron('H * * * *')
    }


}


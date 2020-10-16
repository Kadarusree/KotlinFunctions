fun main(){
  var D1 = Developer()
  D1.skill = "Android"
    D1.getSkill()

  var D2 = Developer()
  D2.skill = "Java"
  D2.getSkill()




  var D3 = D2.getNewSkill(D1)
  println(D3.skill)
  //can we create a same dev with 2 skills?
  //this can be done with extension functions
  //using ext fun we can add functions in other class without touching that class
}

fun Developer.getNewSkill(dev : Developer) : Developer{
  var D3 = Developer()
  D3.skill = this.skill+"  "+dev.skill
  return D3
}


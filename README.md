# screen_setup_library
Use all function before your design setup

like: 
'
ChangeAll(this,resource.getColor(R.color.red))
setContentView(R.layout.activity_main)
'

functions are-> 
ChangeAll(this,resource.getColor(R.color.red)) for changing status bar and navigation bar
ChangeStatusBar(this,resource.getColor(R.color.red)) for changing status bar color only
ChangeNavigationBarColor(this,resource.getColor(R.color.red)) for changing navigation bar color
fullScreen(this) for using fullscreen mode
hideTopBar(this) for using hide top bar

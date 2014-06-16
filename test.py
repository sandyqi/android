'''
Created on Jun 10, 2014

@author: sandyqi
'''
from com.android.monkeyrunner import MonkeyRunner, MonkeyDevice 
import random
device = MonkeyRunner.waitForConnection() 


device.installPackage('/home/sandyqi/workspace/Notification/bin/Notification.apk')

package = 'com.example.notification'   
activity = '.MainActivity'    
runComponent = package + '/' + activity  

device.startActivity(component=runComponent)

print "Now we can push lots of notifications, and then the machine will tackle all of them one by one!"

print "It starts!"
touch_data = {'x':267, 'y':694, 'type':'downAndUp', }
device.touch(touch_data['x'], touch_data['y'], touch_data['type'])

print "Initialize, please push notifications. 3 or more"
MonkeyRunner.sleep(3)
result = device.takeSnapshot()
result.writeToFile('/home/sandyqi/workspace/Notification/output_test2/subsub1.png', 'png')
sub_image1 = result.getSubImage((0,0,800,330))
sub_image1.writeToFile('/home/sandyqi/workspace/Notification/output_test2/subimaggggg1.png', 'png')

print "Click REFRESH"
touch_data = {'x':700, 'y':112, 'type':'downAndUp', }
device.touch(touch_data['x'], touch_data['y'], touch_data['type'])
MonkeyRunner.sleep(1)
result2 = device.takeSnapshot()
result2.writeToFile('/home/sandyqi/workspace/Notification/output_test2/subsub2.png', 'png')
MonkeyRunner.sleep(1)
global sub_image2
sub_image2 = result2.getSubImage((0,0,800,330))
sub_image2.writeToFile('/home/sandyqi/workspace/Notification/output_test2/subimagggggg2.png', 'png')

while sub_image2.sameAs(sub_image1,0.95)==False:
    print "click notification_1"
    touch_data = {'x':200, 'y':268, 'type':'downAndUp', }
    device.touch(touch_data['x'], touch_data['y'], touch_data['type'])
    result = device.takeSnapshot()
    result.writeToFile('/home/sandyqi/workspace/Notification/output_test2/shot3.png', 'png')
    classname = device.getProperty('am.current.comp.class')
    print "click CONFIRM"
    touch_data = {'x':267, 'y':694, 'type':'downAndUp', }
    device.touch(touch_data['x'], touch_data['y'], touch_data['type'])
    result = device.takeSnapshot()
    result.writeToFile(('/home/sandyqi/workspace/Notification/output_test2/shot11.png'), 'png')
    MonkeyRunner.sleep(0.2)
    print "click OK"
    touch_data = {'x':270, 'y':690, 'type':'downAndUp', }
    device.touch(touch_data['x'], touch_data['y'], touch_data['type'])
    result = device.takeSnapshot() 
    result.writeToFile(('/home/sandyqi/workspace/Notification/output_test2/shot22.png'), 'png')
    print "Click REFRESH"
    MonkeyRunner.sleep(0.4)
    touch_data = {'x':700, 'y':112, 'type':'downAndUp', }
    device.touch(touch_data['x'], touch_data['y'], touch_data['type'])
    result = device.takeSnapshot()
    result.writeToFile(('/home/sandyqi/workspace/Notification/output_test2/shot33.png'), 'png')
    classname = device.getProperty('am.current.comp.class') 
    sub_image2 = result.getSubImage((0,0,800,330))
    sub_image2.writeToFile('/home/sandyqi/workspace/Notification/output_test2/subimagggggg2.png', 'png')
print "The Notification Box is Empty"





print "Start it again to see what functions the app has"
MonkeyRunner.sleep(0.3)
classname = device.getProperty('am.current.comp.class')
width=device.getProperty('display.width')
height = device.getProperty('display.height')
density = device.getProperty('display.density')
data = device.getProperty('am.currentdata')
print "The current width, height, data, and class name: ",width, height, data, classname
MonkeyRunner.sleep(0.3)
print "Initialize, please push notifications. 3 or more times"
result = device.takeSnapshot()
result.writeToFile('/home/sandyqi/workspace/Notification/output/shot1.png', 'png')

MonkeyRunner.sleep(3)
print "2 click REFRESH"
touch_data = {'x':700, 'y':112, 'type':'downAndUp', }
device.touch(touch_data['x'], touch_data['y'], touch_data['type'])
result = device.takeSnapshot()
result.writeToFile('/home/sandyqi/workspace/Notification/output/shot2.png', 'png')

MonkeyRunner.sleep(0.4)
print "3 click notification_1"
touch_data = {'x':200, 'y':268, 'type':'downAndUp', }
device.touch(touch_data['x'], touch_data['y'], touch_data['type'])
result = device.takeSnapshot()
result.writeToFile('/home/sandyqi/workspace/Notification/output/shot3.png', 'png')

MonkeyRunner.sleep(0.4)
print "4 click RETURN"
touch_data = {'x':267, 'y':996, 'type':'downAndUp', }
device.touch(touch_data['x'], touch_data['y'], touch_data['type'])
result = device.takeSnapshot()
result.writeToFile('/home/sandyqi/workspace/Notification/output/shot4.png', 'png')

MonkeyRunner.sleep(0.4)
print "5 click notification_2"
touch_data = {'x':200, 'y':369, 'type':'downAndUp', }
device.touch(touch_data['x'], touch_data['y'], touch_data['type'])
result = device.takeSnapshot()
result.writeToFile('/home/sandyqi/workspace/Notification/output/shot5.png', 'png')

MonkeyRunner.sleep(0.4)
print "6 click CONFIRM"
touch_data = {'x':267, 'y':694, 'type':'downAndUp', }
device.touch(touch_data['x'], touch_data['y'], touch_data['type'])
result = device.takeSnapshot()
result.writeToFile('/home/sandyqi/workspace/Notification/output/shot6.png', 'png')

MonkeyRunner.sleep(0.4)
print "7 click OK"
touch_data = {'x':270, 'y':690, 'type':'downAndUp', }
device.touch(touch_data['x'], touch_data['y'], touch_data['type'])
result = device.takeSnapshot() 
result.writeToFile('/home/sandyqi/workspace/Notification/output/shot7.png', 'png')

MonkeyRunner.sleep(0.4)
print "8 click notification_3"
touch_data = {'x':200, 'y':477, 'type':'downAndUp', }
device.touch(touch_data['x'], touch_data['y'], touch_data['type'])
result = device.takeSnapshot()
result.writeToFile('/home/sandyqi/workspace/Notification/output/shot8.png', 'png')

MonkeyRunner.sleep(0.4)
print "9 click INGORE"
touch_data = {'x':267, 'y':845, 'type':'downAndUp', }
device.touch(touch_data['x'], touch_data['y'], touch_data['type'])
result = device.takeSnapshot() 
result.writeToFile('/home/sandyqi/workspace/Notification/output/shot9.png', 'png') 

MonkeyRunner.sleep(0.4)
print "9 click OK"
touch_data = {'x':270, 'y':690, 'type':'downAndUp', }
device.touch(touch_data['x'], touch_data['y'], touch_data['type'])
result = device.takeSnapshot() 
result.writeToFile('/home/sandyqi/workspace/Notification/output/shot10.png', 'png') 

print "push more notifications! 5+"
MonkeyRunner.sleep(3)
print "10 click REFRESH"
touch_data = {'x':700, 'y':112, 'type':'downAndUp', }
device.touch(touch_data['x'], touch_data['y'], touch_data['type'])
result = device.takeSnapshot()
result.writeToFile('/home/sandyqi/workspace/Notification/output/shot10.png', 'png')



print "random click 10 times"
MonkeyRunner.sleep(0.4)

for i in range(1, 10):
    num1 = random.randrange(799)
    num2 = random.randrange(1190)

    # Every so often inject a touch to spice things up!
    print "  click somewhere  ",num1, num2
    device.touch(num1, num2, 'DOWN_AND_UP')
    MonkeyRunner.sleep(0.4)
  
print "drag notification"
device.drag((50,5), (50,800), 1.0, 10)
result = device.takeSnapshot()
result.writeToFile('/home/sandyqi/workspace/Notification/output_test/shot2.png', 'png')

print "Touch notification"
MonkeyRunner.sleep(0.4)
touch_data = {'x':330, 'y':130, 'type':'downAndUp', }
device.touch(touch_data['x'], touch_data['y'], touch_data['type'])
result = device.takeSnapshot()
result.writeToFile('/home/sandyqi/workspace/Notification/output_test/shot2.png', 'png')

MonkeyRunner.sleep(0.4)
print "4 click RETURN"
touch_data = {'x':267, 'y':996, 'type':'downAndUp', }
device.touch(touch_data['x'], touch_data['y'], touch_data['type'])
result = device.takeSnapshot()
result.writeToFile('/home/sandyqi/workspace/Notification/output/shot4.png', 'png')



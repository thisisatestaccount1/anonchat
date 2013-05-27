Ubuntu Setup
============

Java
----

  - Download Java 7 from http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html

  - Unpack in /usr/local:

        $ sudo mv ~/Downloads/jdk-7u21-linux-x64.tar.gz /usr/local
        $ sudo tar -C /usr/local -xzvf /usr/local/jdk-7u21-linux-x64.tar.gz
        $ sudo ln -s /usr/local/jdk1.7.0_21 /usr/local/java

  - Add the following to the end of your ~/.bashrc:

        JAVA_HOME=/usr/local/java
        PATH=$PATH:$JAVA_HOME/bin

  - Test to make sure everything's working. The following commands should print out something like "java version 1.7.0_21"

        $ source ~/.bashrc
        $ java -version

Ant
---

  - Download Ant from http://apache.tradebit.com/pub//ant/binaries/apache-ant-1.9.1-bin.tar.gz

        $ sudo mv ~/Downloads/apache-ant-1.9.1-bin.tar.gz /usr/local
        $ sudo tar -C /usr/local -xzvf /usr/local/apache-ant-1.9.1-bin.tar.gz
        $ sudo ln -s /usr/local/apache-ant-1.9.1 /usr/local/ant
        
  - Add the following to the end of your ~/.bashrc

        ANT_HOME=/usr/local/ant
        PATH=$PATH:$ANT_HOME

  - Test to make sure it works. The following commands should print out something like "Apache Ant 1.9.1"
 
        $ source ~/.bashrc
        $ ant -version

Eclipse
-------

- Download Eclipse from http://www.eclipse.org/downloads/packages/eclipse-ide-java-developers/junosr2

        $ tar -C ~ -xzvf ~/eclipse-java-juno-SR2-linux-gtk-x86_64.tar.gz

- Test - try launching Eclipse from the command line with:

        $ ~/eclipse/eclipse

- Create a Unity dock icon (optional):

        $ sudo apt-get -y install gnome-panel
        $ gnome-desktop-item-edit --create-new ~/.local/share/eclipse.desktop
        
  - In the window that pops up, fill in the following:

    - Type: Application
    - Name: Eclipse
    - Command: /home/<yourusername>/eclipse/eclipse
    - Click the icon in the left-hand corner and browse to /home/<yourusername>/eclipse/icon.pxm

  - Open up the file system browser by clicking the Folder icon in the Unity dock and navigate to your home directory
  - Type ctrl-h to show hidden files
  - Browse to .local/share/eclipse.desktop
  - You should see a shiny Eclipse icon - drag it into your dock
  - Test - try launching Eclipse from the dock icon.

- Create a workspace for the hackathon

        $ mkdir -p ~/hackathon/workspace

- Lauch Eclipse and select /home/<yourusername>/hackathon/workspace as the workspace1

- Exit the "Welcome..." dialogue

- Install the Egit plugin
  - Help > Install New Software
  - Add...
    - Name: Egit
    - Location: http://www.apache.org/dist/ant/ivyde/updatesite
  - Check everything, click Next, Next, agree to license, Finish
  - Restart Eclipse

- Install the IvyDE plugin
  - Help > Install New Software
  - Add...
    - Name: IvyDE Updates
    - Location: http://www.apache.org/dist/ant/ivyde/updatesite
  - Check everything, click Next, Next, agree to license, Finish
  - Restart Eclipse

- Turn off tabs
  - Window > Preferences > General > Editors > Text Editors
  - Check "Insert spaces for tabs"
  - Apply, OK

Git
---

- Create a github account
- Set up git on your machine: https://help.github.com/articles/set-up-git
- Fork the project repository & clone from Eclipse
  - Go to https://github.com/ch00ver/anonchat
  - Click Fork
  - When the fork is done, copy the HTTPS url of the forked repo to clipboard
- In Eclipse:
  - File > Import > Git > Projects from Git, URI
  - The URI information should be automatically filled in from your clipboard
  - Edit the URI to put your username in front of the hostname. For example, if your GitHub username is "ch00ver",

- TODO

- Under the "Team" section of the README.md, add your name.

Tomcat
------

- TODO 

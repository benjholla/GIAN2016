# Antivirus Evasion

This lab experiments with evading antivirus software. Try modifying the CVE-2013-0422 Java exploit code until it is undetectable by Antivirus. To test your modified code upload it to [VirusTotal.com](https://www.virustotal.com/). For examples of techniques to try look at the CVE-2012-4681 project. The password to unzip exploits is "infected".

This particular exploit program will only open calc.exe on a Windows machine if successful (change to “calc” for a Mac). However it’s good practice never to run untrusted code that you don’t understand. If you are running an updated version of Java 7 (you should be!) then you will get the runtime exception “java.lang.IncompatibleClassChangeError: Found class com.sun.jmx.mbeanserver.MBeanInstantiator, but interface was expected”.
/**
 *
 */
package com.kh.common.model.vo;
 
import javax.mail.PasswordAuthentication;
import javax.mail.Authenticator;
 
/**
 * @author viper9
 *
 */
public class SMTPAuthenticator extends Authenticator {
    public SMTPAuthenticator() {
        super();
    }
 
    public PasswordAuthentication getPasswordAuthentication() {
        String username = "메일아이디";
        String password = "메일비밀번호";
        return new PasswordAuthentication(username, password);
    }
}
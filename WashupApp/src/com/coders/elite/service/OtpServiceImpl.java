package com.coders.elite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coders.elite.bean.Otp;
import com.coders.elite.dao.OtpDAO;
 
@Service("otpService")
public class OtpServiceImpl implements OtpService {
 
 @Autowired
 OtpDAO otpDao;
 

 @Transactional
 public Otp getOtp(String mobile) {
 return otpDao.getOtp(mobile);
 }
 
 @Transactional
 public void addOtp(Otp otp) {
  otpDao.addOtp(otp);
 }
 
 @Transactional
 public void updateOtp(Otp otp) {
  otpDao.updateOtp(otp);
 
 }
 
 @Transactional
 public void deleteOtp(int id) {
  otpDao.deleteOtp(id);
  
 }

 
}

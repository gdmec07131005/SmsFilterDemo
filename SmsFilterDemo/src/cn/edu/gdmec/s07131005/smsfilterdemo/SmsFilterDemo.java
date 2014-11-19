package cn.edu.gdmec.s07131005.smsfilterdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

public class SmsFilterDemo extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		//��ȡ���Ź㲥�ĸ�����Ϣ
		Bundle bundle = intent.getExtras();   
		//ͨ��pdus���Ի�ý��յ���������Ϣ               
        Object[] object = (Object[])bundle.get("pdus");   
      //�������Ŷ���array���������յ��Ķ��󳤶�������array�Ĵ�С    
        SmsMessage sms[]=new SmsMessage[object.length];   
        for(int i=0;i<object.length;i++)   
        {   
            sms[0] = SmsMessage.createFromPdu((byte[])object[i]);  
			//����ڵ绰������ڱ����صĺ��룬�͵�������������ֹ�㲥��������ϵͳ�Ͳ������ܵ����ŵ���ʾ���û�Ҳ���ղ���������
    		if(sms[i].getDisplayOriginatingAddress().toString().equals("110")){
                Toast.makeText(context, "���룺"+sms[i].getDisplayOriginatingAddress()+" �����Ķ����ѱ����أ������ǣ�"+sms[i].getDisplayMessageBody(), Toast.LENGTH_SHORT).show();   
    			abortBroadcast();                                  
    		};
        }   
 	}  

	}
package com.engagelab.privates.common;

import android.content.Context;
import android.text.TextUtils;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.utils.AESUtil;
import com.engagelab.privates.common.utils.GZipUtil;
import com.engagelab.privates.common.utils.SM4Util;
import com.engagelab.privates.common.utils.StringUtil;
import com.engagelab.privates.common.utils.SystemUtil;
import com.engagelab.privates.core.api.Address;
import com.engagelab.privates.core.api.Outputer;
import com.engagelab.privates.core.global.MTCoreGlobal;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.just.agentweb.DefaultWebClient;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DatagramSocket f345a;
    public boolean b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(Context context, String str, int i) {
        try {
            if (TextUtils.isEmpty(str) || i <= 0) {
                return false;
            }
            MTCommonLog.d("UdpClient", "udp connect " + str + ":" + i);
            InetAddress byName = InetAddress.getByName(str);
            byte[] bArrA = a(context);
            if (bArrA == null) {
                return false;
            }
            DatagramPacket datagramPacket = new DatagramPacket(bArrA, bArrA.length, byName, i);
            DatagramSocket datagramSocket = new DatagramSocket();
            this.f345a = datagramSocket;
            datagramSocket.setSoTimeout(6000);
            this.f345a.send(datagramPacket);
            byte[] bArr = new byte[1024];
            this.f345a.receive(new DatagramPacket(bArr, 1024));
            return a(context, bArr);
        } catch (Throwable th) {
            MTCommonLog.d("UdpClient", "udp connect failed " + th.getMessage());
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<String> b(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c(context));
        Collections.shuffle(arrayList);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Set<String> c(Context context) {
        Set<String> setN = w.n(context);
        Address address = MTCoreGlobal.getAddress();
        int sisPort = address.getSisPort();
        if (sisPort <= 0) {
            return setN;
        }
        String[] sisHostArray = address.getSisHostArray();
        if (sisHostArray != null && sisHostArray.length > 0) {
            for (String str : sisHostArray) {
                setN.add(str + ":" + sisPort);
            }
        }
        String[] sisIpArray = address.getSisIpArray();
        if (sisIpArray != null && sisIpArray.length > 0) {
            for (String str2 : sisIpArray) {
                setN.add(str2 + ":" + sisPort);
            }
        }
        return setN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(Context context) {
        if (MTGlobal.getTcpSSL() && TextUtils.isEmpty(w.a(context))) {
            MTCommonLog.d("UdpClient", "get crt：" + p.b(context));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void d(Context context) {
        if (this.b) {
            MTCommonLog.d("UdpClient", "can't connect, isUdpConnecting");
            return;
        }
        this.b = true;
        e(context);
        List<String> listB = b(context);
        if (listB.isEmpty()) {
            MTCommonLog.d("UdpClient", "there are no udp connect address");
            return;
        }
        ArrayList<String> arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            arrayList.addAll(listB);
        }
        for (String str : arrayList) {
            if (!w.b(context)) {
                MTCommonLog.d("UdpClient", "can't connect ,connect state is false");
                f(context);
                return;
            } else {
                if (!SystemUtil.isNetworkConnecting(context)) {
                    MTCommonLog.d("UdpClient", "can't connect, network is disConnected");
                    return;
                }
                String[] strArrSplit = str.split(":");
                String str2 = strArrSplit[strArrSplit.length - 1];
                if (a(context, str.substring(0, (str.length() - str2.length()) - 1), Integer.parseInt(str2))) {
                    return;
                }
            }
        }
    }

    public void f(Context context) {
        this.b = false;
        if (this.f345a != null) {
            MTCommonLog.d("UdpClient", "udp disconnect");
            this.f345a.close();
        }
    }

    public final void b(Context context, JSONObject jSONObject) throws JSONException {
        if (MTGlobal.getTcpSSL()) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ssl_ips");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                return;
            }
            Set<String> setM = w.m(context);
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                setM.add(String.valueOf(jSONArrayOptJSONArray.get(i)));
            }
            w.c(context, setM);
            return;
        }
        MTCommonLog.d("UdpClient", "no has cert_ver");
        w.c(context, new LinkedHashSet());
    }

    public final void c(Context context, JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ips");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return;
        }
        Set<String> setL = w.l(context);
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            setL.add(String.valueOf(jSONArrayOptJSONArray.get(i)));
        }
        w.b(context, setL);
    }

    public final byte[] a(Context context) {
        int i;
        byte[] bArrEncryptBytes;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MTPushConstants.PlatformNode.KEY_PLATFORM, 0);
            jSONObject.put("sdkver", "4.3.9");
            jSONObject.put("appkey", MTGlobal.getAppKey(context));
            jSONObject.put("uid", w.o(context));
            jSONObject.put("type", MTGlobal.getNetworkType());
            jSONObject.put("opera", MTGlobal.getNetworkName());
            MTCommonLog.d("UdpClient", "udp send:" + MTCommonLog.toLogString(jSONObject));
            byte[] bArrStringToUtf8Bytes = StringUtil.stringToUtf8Bytes(jSONObject.toString());
            byte[] bArrZip = GZipUtil.zip(bArrStringToUtf8Bytes);
            if (bArrZip == null) {
                i = 0;
            } else {
                bArrStringToUtf8Bytes = bArrZip;
                i = 1;
            }
            int length = bArrStringToUtf8Bytes.length;
            int iGenerateSeed = AESUtil.generateSeed();
            long j = iGenerateSeed;
            String md5AesKey = AESUtil.getMd5AesKey(j);
            byte b = i != 0 ? (byte) 1 : (byte) 0;
            int encryptType = MTGlobal.getEncryptType();
            if (encryptType == 1) {
                b = (byte) (b | 16);
                bArrEncryptBytes = AESUtil.encryptBytes(bArrStringToUtf8Bytes, md5AesKey, md5AesKey.substring(0, 16));
            } else if (encryptType != 2) {
                bArrEncryptBytes = AESUtil.encryptBytes(bArrStringToUtf8Bytes, md5AesKey);
            } else {
                b = (byte) (b | 32);
                bArrEncryptBytes = SM4Util.encryptBytes(bArrStringToUtf8Bytes, md5AesKey, md5AesKey.substring(0, 16));
            }
            Outputer outputer = new Outputer(bArrEncryptBytes.length + 10);
            outputer.writeU16(0);
            outputer.writeByteArray("UG".getBytes());
            outputer.writeU32(j);
            outputer.writeU8At(b, 4);
            outputer.writeU16(length);
            outputer.writeByteArray(bArrEncryptBytes);
            outputer.writeU16At(outputer.current(), 0);
            MTCommonLog.d("UdpClient", "send totalLength:" + outputer.current() + ", encryption:" + encryptType + ", compress:" + i + ", sid:" + iGenerateSeed);
            return outputer.toByteArray();
        } catch (Throwable th) {
            MTCommonLog.w("UdpClient", "packageRequest failed " + th.getMessage());
            return null;
        }
    }

    public final void d(Context context, JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("sis_ips");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return;
        }
        Set<String> setN = w.n(context);
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            setN.add(String.valueOf(jSONArrayOptJSONArray.get(i)));
        }
        w.d(context, setN);
    }

    public final boolean a(Context context, byte[] bArr) {
        byte[] bArrDecryptBytes;
        try {
            byte[] bArr2 = new byte[10];
            System.arraycopy(bArr, 0, bArr2, 0, 10);
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr2);
            short s = byteBufferWrap.getShort();
            byteBufferWrap.getShort();
            int i = byteBufferWrap.getInt();
            long j = 16777215 & i;
            byteBufferWrap.getShort();
            int i2 = i >>> 28;
            int i3 = (i >>> 24) & 1;
            String md5AesKey = AESUtil.getMd5AesKey(j);
            MTCommonLog.d("UdpClient", "receive totalLength:" + ((int) s) + ", encryption:" + i2 + ", compress:" + i3 + ", sid:" + j);
            int i4 = s + (-10);
            byte[] bArr3 = new byte[i4];
            System.arraycopy(bArr, 10, bArr3, 0, i4);
            if (i2 == 1) {
                bArrDecryptBytes = AESUtil.decryptBytes(bArr3, md5AesKey, md5AesKey.substring(0, 16));
            } else if (i2 != 2) {
                bArrDecryptBytes = AESUtil.decryptBytes(bArr3, md5AesKey);
            } else {
                bArrDecryptBytes = SM4Util.decryptBytes(bArr3, md5AesKey);
            }
            if (i3 == 1) {
                bArrDecryptBytes = GZipUtil.unzip(bArrDecryptBytes);
            }
            JSONObject jSONObject = new JSONObject(new String(bArrDecryptBytes));
            MTCommonLog.d("UdpClient", "udp receive " + MTCommonLog.toLogString(jSONObject));
            d(context, jSONObject);
            c(context, jSONObject);
            b(context, jSONObject);
            a(context, jSONObject);
            return true;
        } catch (Throwable th) {
            MTCommonLog.w("UdpClient", "parseResponse failed " + th.getMessage());
            return false;
        }
    }

    public final void a(Context context, JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("http_report");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            Set<String> setC = w.c(context);
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                setC.add(DefaultWebClient.HTTP_SCHEME + jSONArrayOptJSONArray.get(i));
            }
            w.a(context, setC);
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("https_report");
        if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
            return;
        }
        Set<String> setC2 = w.c(context);
        for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
            setC2.add(DefaultWebClient.HTTPS_SCHEME + jSONArrayOptJSONArray2.get(i2));
        }
        w.a(context, setC2);
    }
}

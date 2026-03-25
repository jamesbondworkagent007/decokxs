package com.bytedance.bdtracker;

import android.text.TextUtils;
import com.bytedance.applog.encryptor.IEncryptorType;
import com.bytedance.mpaas.IEncryptor;

/* JADX INFO: loaded from: classes2.dex */
public class a0 implements IEncryptorType, IEncryptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IEncryptor f130a;
    public final String b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public a0(IEncryptor iEncryptor, String str) {
        this.f130a = iEncryptor;
        this.b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.mpaas.IEncryptor
    public byte[] encrypt(byte[] bArr, int i) {
        IEncryptor iEncryptor = this.f130a;
        return iEncryptor == null ? bArr : iEncryptor.encrypt(bArr, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.encryptor.IEncryptorType
    public String encryptorType() {
        return TextUtils.isEmpty(this.b) ? IEncryptorType.DEFAULT_ENCRYPTOR : this.b;
    }
}

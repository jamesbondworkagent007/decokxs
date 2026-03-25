package com.immomo.mls;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import o.C7330ahm;
import o.C7914asn;

/* JADX INFO: loaded from: classes3.dex */
public class InitData implements Parcelable {
    public static final Parcelable.Creator<InitData> CREATOR = new Parcelable.Creator<InitData>() { // from class: com.immomo.mls.InitData.1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InitData createFromParcel(Parcel parcel) {
            return new InitData(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InitData[] newArray(int i) {
            return new InitData[i];
        }
    };
    public long AEQbTJ;
    public String EZpvd;
    public HashMap KWHzl;
    public int OLrzqt;
    public String[] copydefault;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return this.EZpvd;
    }

    public InitData(String str) {
        this.OLrzqt = 0;
        this.AEQbTJ = C7330ahm.valueOf;
        this.EZpvd = str;
        AEQbTJ(true);
        KWHzl(true);
        EZpvd(C7330ahm.DbNXlk);
        EZpvd();
    }

    public InitData OLrzqt() {
        KWHzl(1);
        return this;
    }

    public InitData AEQbTJ(boolean z) {
        if (z) {
            KWHzl(16);
        } else {
            EZpvd(16);
        }
        return this;
    }

    public InitData KWHzl(boolean z) {
        if (z) {
            KWHzl(32);
        } else {
            EZpvd(32);
        }
        return this;
    }

    public InitData EZpvd(boolean z) {
        if (z) {
            KWHzl(64);
        } else {
            EZpvd(64);
        }
        return this;
    }

    public InitData EZpvd() {
        KWHzl(8);
        return this;
    }

    public InitData copydefault() {
        KWHzl(128);
        return this;
    }

    public InitData KWHzl() {
        KWHzl(256);
        return this;
    }

    public void KWHzl(int i) {
        this.OLrzqt = C7914asn.AEQbTJ(this.OLrzqt, i);
    }

    public void EZpvd(int i) {
        this.OLrzqt = C7914asn.OLrzqt(this.OLrzqt, i);
    }

    public boolean AEQbTJ(int i) {
        return C7914asn.EZpvd(this.OLrzqt, i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.EZpvd);
        parcel.writeInt(this.OLrzqt);
        parcel.writeSerializable(this.KWHzl);
        parcel.writeStringArray(this.copydefault);
        parcel.writeLong(this.AEQbTJ);
    }

    public InitData(Parcel parcel) {
        this.OLrzqt = 0;
        this.AEQbTJ = C7330ahm.valueOf;
        this.EZpvd = parcel.readString();
        this.OLrzqt = parcel.readInt();
        this.KWHzl = (HashMap) parcel.readSerializable();
        this.copydefault = parcel.createStringArray();
        this.AEQbTJ = parcel.readLong();
    }

    public InitData(InitData initData) {
        this.OLrzqt = 0;
        this.AEQbTJ = C7330ahm.valueOf;
        this.EZpvd = initData.EZpvd;
        this.OLrzqt = initData.OLrzqt;
        if (initData.KWHzl != null) {
            this.KWHzl = new HashMap(initData.KWHzl);
        }
        String[] strArr = initData.copydefault;
        if (strArr != null) {
            this.copydefault = (String[]) strArr.clone();
        }
        this.AEQbTJ = initData.AEQbTJ;
    }
}

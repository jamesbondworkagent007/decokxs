package com.engagelab.privates.analysis.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.engagelab.privates.common.l;
import com.engagelab.privates.common.log.MTCommonLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes21.dex */
public class Account implements Parcelable {
    public static final int SEX_FEMALE = 2;
    public static final int SEX_MALE = 1;
    public static final int SEX_NOT_DEFINE = 0;
    private static final String TAG = "Account";
    private String email;
    public HashMap extraAttrMap;
    private List<String> idList;
    public HashMap internalAttrMap;
    private String name;
    private String phone;
    private int sex;
    private long time;
    private static final Pattern phonePattern = Pattern.compile("^[+|(|0-9][0-9|\\-|(|)| ]{1,19}$");
    private static final Pattern emailPattern = Pattern.compile("^.+@.+\\..+$");
    public static final Parcelable.Creator<Account> CREATOR = new a();

    public static final class a implements Parcelable.Creator<Account> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Account createFromParcel(Parcel parcel) {
            return new Account(parcel);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Account[] newArray(int i) {
            return new Account[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Account(String... strArr) {
        this.extraAttrMap = new HashMap();
        this.internalAttrMap = new HashMap();
        try {
            if (strArr == null) {
                MTCommonLog.w(TAG, "ids must not be empty");
                return;
            }
            ArrayList arrayList = new ArrayList();
            int length = strArr.length;
            int i = 0;
            boolean z = false;
            while (true) {
                if (i >= length) {
                    if (!z) {
                        MTCommonLog.w(TAG, "all id is empty");
                        return;
                    }
                    for (int i2 = 1; i2 < strArr.length; i2++) {
                        if (!strArr[0].equals(strArr[i2]) && l.b(strArr[i2]) && !arrayList.contains(strArr[i2])) {
                            arrayList.add(strArr[i2]);
                        }
                    }
                    arrayList.add(0, l.b(strArr[0]) ? strArr[0] : "");
                    this.idList = arrayList;
                    return;
                }
                String str = strArr[i];
                if (str == null) {
                    MTCommonLog.w(TAG, "has null id");
                    return;
                } else {
                    if (!TextUtils.isEmpty(str)) {
                        z = true;
                    }
                    i++;
                }
            }
        } catch (Exception e) {
            MTCommonLog.w(TAG, "Account e:" + e.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void putInternalAttr(String str, Object obj) {
        try {
            if (l.b(obj)) {
                Object objA = l.a(obj);
                if (l.b(objA)) {
                    this.internalAttrMap.put(str, objA);
                    MTCommonLog.d(TAG, "putInternalAttr key:" + str + ",value:" + objA);
                }
            }
        } catch (Exception e) {
            MTCommonLog.d(TAG, "putInternalAttr failed " + e.getMessage());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getEmail() {
        return this.email;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, Object> getExtraAttrMap() {
        return this.extraAttrMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<String> getIdList() {
        return this.idList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, Object> getInternalAttrMap() {
        return this.internalAttrMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPhone() {
        return this.phone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getSex() {
        return this.sex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long getTime() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Account putExtraAttr(String str, Object obj) {
        try {
        } catch (Exception e) {
            MTCommonLog.d(TAG, "putExtraAttr failed " + e.getMessage());
        }
        if (!l.a(str, obj)) {
            return this;
        }
        if (str.startsWith("$")) {
            MTCommonLog.d(TAG, "extra key can't startWith $");
            return this;
        }
        if (this.extraAttrMap.size() >= 30 && !this.extraAttrMap.containsKey(str)) {
            MTCommonLog.d(TAG, "can't put key [" + str + "], account extraAttrMap size can't be no more than 30");
            return this;
        }
        Object objA = l.a(obj);
        if (!l.b(objA)) {
            return this;
        }
        this.extraAttrMap.put("_" + str, objA);
        MTCommonLog.d(TAG, "putExtraAttr key:" + str + ",value:" + objA);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Account setEmail(String str) {
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.d(TAG, "mail can't be empty");
            return this;
        }
        if (emailPattern.matcher(str).matches()) {
            this.email = str;
            putInternalAttr(MTAnalysisConstants.ACCOUNT_INTERNAL_MAIL, str);
            return this;
        }
        MTCommonLog.d(TAG, "mail is invalid, mail:" + str);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Account setName(String str) {
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.d(TAG, "name must not be empty");
            return this;
        }
        this.name = str;
        putInternalAttr(MTAnalysisConstants.ACCOUNT_INTERNAL_NAME, str);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Account setPhone(String str) {
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.d(TAG, "phone can't be empty");
            return this;
        }
        if (phonePattern.matcher(str).matches()) {
            this.phone = str;
            putInternalAttr(MTAnalysisConstants.ACCOUNT_INTERNAL_PHONE, str);
            return this;
        }
        MTCommonLog.d(TAG, "phone is invalid, phone:" + str);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Account setTime(long j) {
        if (j < 0) {
            MTCommonLog.d(TAG, "time can't be no less than 0");
            return this;
        }
        this.time = j;
        putInternalAttr(MTAnalysisConstants.ACCOUNT_INTERNAL_TIME, Long.valueOf(j));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "\n{\n  idList='" + this.idList + ",\n  time=" + this.time + ",\n  name='" + this.name + ",\n  sex='" + this.sex + ",\n  phone='" + this.phone + ",\n  email='" + this.email + ",\n  extraAttrMap='" + this.extraAttrMap + ",\n  internalAttrMap=" + this.internalAttrMap + "\n}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.idList);
        parcel.writeLong(this.time);
        parcel.writeString(this.name);
        parcel.writeInt(this.sex);
        parcel.writeString(this.phone);
        parcel.writeString(this.email);
        parcel.writeMap(this.extraAttrMap);
        parcel.writeMap(this.internalAttrMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Account setSex(int i) {
        if (i < 0 || i > 2) {
            MTCommonLog.d(TAG, "sex range is [0,2],0 is no define,1 is male,2 is female");
            return this;
        }
        this.sex = i;
        putInternalAttr(MTAnalysisConstants.ACCOUNT_INTERNAL_SEX, Integer.valueOf(i));
        return this;
    }

    public Account(Parcel parcel) {
        this.extraAttrMap = new HashMap();
        this.internalAttrMap = new HashMap();
        this.idList = parcel.createStringArrayList();
        this.time = parcel.readLong();
        this.name = parcel.readString();
        this.sex = parcel.readInt();
        this.phone = parcel.readString();
        this.email = parcel.readString();
        this.extraAttrMap = parcel.readHashMap(HashMap.class.getClassLoader());
        this.internalAttrMap = parcel.readHashMap(HashMap.class.getClassLoader());
    }
}

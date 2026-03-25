package o;

import io.reactivex.subjects.PublishSubject;

/* JADX INFO: renamed from: o.yrN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class FragmentC57910yrN extends android.app.Fragment {
    public java.util.Map<java.lang.String, PublishSubject<C57906yrJ>> OLrzqt = new java.util.HashMap();

    public void AEQbTJ(java.lang.String str) {
    }

    @Override // android.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public void EZpvd(@androidx.annotation.NonNull java.lang.String[] strArr) {
        requestPermissions(strArr, 42);
    }

    @Override // android.app.Fragment
    public void onRequestPermissionsResult(int i, @androidx.annotation.NonNull java.lang.String[] strArr, @androidx.annotation.NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 42) {
            return;
        }
        boolean[] zArr = new boolean[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            zArr[i2] = shouldShowRequestPermissionRationale(strArr[i2]);
        }
        AEQbTJ(strArr, iArr, zArr);
    }

    public void AEQbTJ(java.lang.String[] strArr, int[] iArr, boolean[] zArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            AEQbTJ("onRequestPermissionsResult  " + strArr[i]);
            PublishSubject<C57906yrJ> publishSubject = this.OLrzqt.get(strArr[i]);
            if (publishSubject == null) {
                return;
            }
            this.OLrzqt.remove(strArr[i]);
            publishSubject.onNext(new C57906yrJ(strArr[i], iArr[i] == 0, zArr[i]));
            publishSubject.onComplete();
        }
    }

    public boolean KWHzl(java.lang.String str) {
        return getActivity().checkSelfPermission(str) == 0;
    }

    public boolean copydefault(java.lang.String str) {
        return getActivity().getPackageManager().isPermissionRevokedByPolicy(str, getActivity().getPackageName());
    }

    public PublishSubject<C57906yrJ> OLrzqt(@androidx.annotation.NonNull java.lang.String str) {
        return this.OLrzqt.get(str);
    }

    public boolean EZpvd(@androidx.annotation.NonNull java.lang.String str) {
        return this.OLrzqt.containsKey(str);
    }

    public PublishSubject<C57906yrJ> KWHzl(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull PublishSubject<C57906yrJ> publishSubject) {
        return this.OLrzqt.put(str, publishSubject);
    }
}

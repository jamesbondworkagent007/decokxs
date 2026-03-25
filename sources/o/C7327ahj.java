package o;

import com.immomo.mls.InitData;

/* JADX INFO: renamed from: o.ahj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7327ahj {
    private C7327ahj() {
    }

    public static InitData copydefault(@androidx.annotation.NonNull java.lang.String str) {
        return new InitData(str);
    }

    public static InitData EZpvd(@androidx.annotation.NonNull java.lang.String str, boolean z) {
        InitData initData = new InitData(str);
        if (z) {
            initData.OLrzqt();
        }
        return initData;
    }

    public static InitData EZpvd(@androidx.annotation.Nullable android.os.Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        InitData initData = (InitData) bundle.getParcelable("__INIT_DATA");
        return initData == null ? new InitData(bundle.getString("LUA_URL")) : initData;
    }

    public static android.os.Bundle OLrzqt(InitData initData) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("__INIT_DATA", initData);
        return bundle;
    }
}

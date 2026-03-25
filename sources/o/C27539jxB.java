package o;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: renamed from: o.jxB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27539jxB {
    public static final C27539jxB OLrzqt = new C27539jxB();
    public static Gson copydefault = new Gson();
    public static final int EZpvd = 8;

    private C27539jxB() {
    }

    public final RequestBody copydefault(java.lang.Object obj) {
        java.lang.String string;
        JsonElement jsonTree = copydefault.toJsonTree(obj);
        if (jsonTree == null || (string = jsonTree.toString()) == null) {
            return null;
        }
        return RequestBody.Companion.create(string, MediaType.Companion.get(EIP1271Verifier.mediaTypeString));
    }
}

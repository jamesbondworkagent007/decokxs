package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C31976mKx;

/* JADX INFO: renamed from: o.mMb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ActivityC32008mMb extends mKV {
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.mMd
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC32008mMb.EZpvd(this.KWHzl);
        }
    });
    public final mKI AEQbTJ = new mKI(null, 0, 0, 7, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mKV
    public int AEQbTJ() {
        return C31976mKx.Application.fetchVPNInfo;
    }

    @Override // o.mKV
    public void OLrzqt() {
    }

    public static final RecyclerView EZpvd(ActivityC32008mMb activityC32008mMb) {
        return (RecyclerView) activityC32008mMb.findViewById(C31976mKx.Activity.DLWbHP);
    }

    public final RecyclerView copydefault() {
        java.lang.Object value = this.OLrzqt.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (RecyclerView) value;
    }

    @Override // o.mKV
    public void AEQbTJ(android.os.Bundle bundle) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        android.text.style.StyleSpan styleSpan = new android.text.style.StyleSpan(1);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) "OKGrayManager");
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        mKC mkc = new mKC(new android.text.SpannedString(spannableStringBuilder), 0, 2, null);
        java.util.List<java.lang.String> listAxsJAYaxsJAY = CollectionsKt___CollectionsKt.AxsJAYaxsJAY(C35202nqq.OLrzqt.EZpvd());
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAxsJAYaxsJAY, 10));
        for (java.lang.String str : listAxsJAYaxsJAY) {
            arrayList.add(new mKC(str + " : " + C35202nqq.OLrzqt.AEQbTJ(str), 0, 2, null));
        }
        this.AEQbTJ.copydefault(CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) yDY.gEmmrt(mkc, new mKC("--- " + arrayList.size() + " keys found (key: isHit) ---", 0, 2, null)), (java.lang.Iterable) arrayList));
        copydefault().setAdapter(this.AEQbTJ);
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // o.mKV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}

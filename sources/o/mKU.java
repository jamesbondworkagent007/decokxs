package o;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.SortedMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31976mKx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class mKU extends mKV {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.mKW
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return mKU.KWHzl(this.OLrzqt);
        }
    });
    public final mKI AEQbTJ = new mKI(null, 0, 0, 7, null);
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.mKT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return mKU.AEQbTJ(this.EZpvd);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mKV
    public int AEQbTJ() {
        return C31976mKx.Application.EZpvd;
    }

    @Override // o.mKV
    public void OLrzqt() {
    }

    public static final RecyclerView KWHzl(mKU mku) {
        return (RecyclerView) mku.findViewById(C31976mKx.Activity.OFhtUX);
    }

    public final RecyclerView copydefault() {
        java.lang.Object value = this.copydefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (RecyclerView) value;
    }

    public final java.lang.String EZpvd() {
        return (java.lang.String) this.EZpvd.getValue();
    }

    public static final java.lang.String AEQbTJ(mKU mku) {
        java.lang.String stringExtra = mku.getIntent().getStringExtra("EXT_SP_FILE_NAME");
        Intrinsics.copydefault(stringExtra, "");
        return stringExtra;
    }

    @Override // o.mKV
    public void AEQbTJ(android.os.Bundle bundle) {
        KWHzl();
        copydefault().setAdapter(this.AEQbTJ);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mKU.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) mKU.class);
            intent.putExtra("EXT_SP_FILE_NAME", str);
            return intent;
        }
    }

    public final void KWHzl() {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        android.text.style.StyleSpan styleSpan = new android.text.style.StyleSpan(1);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) EZpvd());
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        mKC mkc = new mKC(new android.text.SpannedString(spannableStringBuilder), 0, 2, null);
        java.util.Map<java.lang.String, ?> all = getSharedPreferences(EZpvd(), 0).getAll();
        Intrinsics.checkNotNullExpressionValue(all, "");
        SortedMap sortedMapGEmmrt = C56423yEv.gEmmrt(all);
        mKC mkc2 = new mKC("--- " + sortedMapGEmmrt.size() + " keys found ---", 0, 2, null);
        java.util.ArrayList arrayList = new java.util.ArrayList(sortedMapGEmmrt.size());
        for (Map.Entry entry : sortedMapGEmmrt.entrySet()) {
            arrayList.add(new mKC(((java.lang.String) entry.getKey()) + " : " + entry.getValue(), 0, 2, null));
        }
        this.AEQbTJ.copydefault(CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) yDY.gEmmrt(mkc, mkc2), (java.lang.Iterable) arrayList));
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

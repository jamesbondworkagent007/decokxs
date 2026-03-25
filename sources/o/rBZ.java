package o;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.ok_kyc_core.extension.OKPdfTestActivity$initListener$1$1$1;
import com.okinc.ok_kyc_core.extension.OKPdfTestActivity$initListener$1$2$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C43662rtX;

/* JADX INFO: loaded from: classes16.dex */
public final class rBZ extends AbstractActivityC33044moy<AbstractC43764rvT> {
    public static final Activity Companion = new Activity(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return C43662rtX.TaskDescription.gEmmrt;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rBZ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        EZpvd();
    }

    private final void EZpvd() {
        final AbstractC43764rvT abstractC43764rvTKWHzl = KWHzl();
        abstractC43764rvTKWHzl.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.rCf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                rBZ.EZpvd(this.KWHzl, abstractC43764rvTKWHzl, view);
            }
        });
        abstractC43764rvTKWHzl.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.rCh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                rBZ.AEQbTJ(this.AEQbTJ, abstractC43764rvTKWHzl, view);
            }
        });
    }

    public static final void EZpvd(rBZ rbz, AbstractC43764rvT abstractC43764rvT, android.view.View view) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(rbz), null, null, new OKPdfTestActivity$initListener$1$1$1(rbz, abstractC43764rvT, null), 3, null);
    }

    public static final void AEQbTJ(rBZ rbz, AbstractC43764rvT abstractC43764rvT, android.view.View view) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(rbz), null, null, new OKPdfTestActivity$initListener$1$2$1(abstractC43764rvT, rbz, null), 3, null);
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}

package o;

import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public class eCI extends AbstractActivityC33013moT {
    public final C59534zip EZpvd = new C59534zip();
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.eCQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return eCI.KWHzl(this.OLrzqt);
        }
    });

    public void AEQbTJ() {
    }

    public eFN KWHzl() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull eFL efl) {
        Intrinsics.checkNotNullParameter(efl, "");
    }

    public final AbstractC16381eip OLrzqt() {
        java.lang.Object value = this.copydefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AbstractC16381eip) value;
    }

    public static final AbstractC16381eip KWHzl(eCI eci) {
        return (AbstractC16381eip) DataBindingUtil.setContentView(eci, C13754dXa.TaskDescription.giSNqX);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        OLrzqt().copydefault.setTitleTypeface("harmony_sans_bold.ttf");
        eFN efnKWHzl = KWHzl();
        if (efnKWHzl != null) {
            java.lang.String strOLrzqt = efnKWHzl.OLrzqt();
            if (strOLrzqt != null) {
                int iAEQbTJ = C33570myu.AEQbTJ() - C55298xhM.dp2px$default(32.0f, null, 1, null);
                ViewGroup.LayoutParams layoutParams = OLrzqt().OLrzqt.getLayoutParams();
                layoutParams.height = iAEQbTJ;
                layoutParams.width = iAEQbTJ;
                OLrzqt().OLrzqt.setLayoutParams(layoutParams);
                android.widget.ImageView imageView = OLrzqt().OLrzqt;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                android.content.Context context = OLrzqt().OLrzqt.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                C33054mpH.EZpvd(imageView, C43454rpb.copydefault(strOLrzqt, context, true), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : "fill", (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : iAEQbTJ, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? iAEQbTJ : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
            }
            java.lang.String strAEQbTJ = efnKWHzl.AEQbTJ();
            if (strAEQbTJ != null) {
                OLrzqt().AEQbTJ.setText(strAEQbTJ);
            }
            if (efnKWHzl.copydefault()) {
                OLrzqt().EZpvd.setVisibility(0);
                OLrzqt().EZpvd.getPaint().setFlags(8);
                OLrzqt().EZpvd.getPaint().setAntiAlias(true);
                AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = C8003auW.copydefault(OLrzqt().EZpvd).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS);
                InterfaceC58227yxM<? super java.lang.Object> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eCK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        eCI.EZpvd(this.OLrzqt, obj);
                    }
                };
                final Function1 function1 = new Function1() { // from class: o.eCL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return eCI.OLrzqt((java.lang.Throwable) obj);
                    }
                };
                abstractC58247yxgThrottleFirst.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eCN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        eCI.EZpvd(function1, obj);
                    }
                });
            } else {
                OLrzqt().EZpvd.setVisibility(4);
            }
            java.util.List<eFL> listKWHzl = efnKWHzl.KWHzl();
            if (listKWHzl != null) {
                OLrzqt().KWHzl.setAdapter(this.EZpvd);
                this.EZpvd.register(eFL.class, new C15383eGh(new Function1() { // from class: o.eCO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return eCI.KWHzl(this.KWHzl, (eFL) obj);
                    }
                }));
                this.EZpvd.setItems(listKWHzl);
            }
        }
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.eCP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                eCI.EZpvd(this.copydefault);
            }
        });
    }

    public static final void EZpvd(eCI eci, java.lang.Object obj) {
        eci.AEQbTJ();
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(eCI eci, eFL efl) {
        Intrinsics.checkNotNullParameter(efl, "");
        eci.copydefault(efl);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(eCI eci) {
        rVN.reportFullyDrawn$default((android.app.Activity) eci, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}

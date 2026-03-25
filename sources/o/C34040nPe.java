package o;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.okinc.im.imui.debug.IMWebSocketFloatingWindowController$show$1;
import com.okinc.okimcore.model.im.ConversationSyncStatus;
import com.okinc.okimcore.model.im.MessengerConnectionStatus;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nPe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34040nPe {
    public static final Observer<MessengerConnectionStatus> AEQbTJ;
    public static final Observer<java.lang.Integer> AhwBna;
    public static final LiveData<java.lang.Integer> AkhnZx;
    public static CoroutineScope EZpvd;
    public static final int KWHzl;
    public static final LiveData<MessengerConnectionStatus> OLrzqt;
    public static final Flow<sNJ> djBIcL;
    public static final LiveData<java.lang.String> fARcdN;
    public static final Observer<java.lang.String> fJNWhG;
    public static final LiveData<java.lang.Integer> fetchVPNInfo;
    public static int gEmmrt;
    public static final Observer<java.lang.Integer> isConnected;
    public static final LiveData<java.lang.Integer> valueOf;
    public static final Observer<java.lang.Integer> values;
    public static final C34040nPe copydefault = new C34040nPe();
    public static int AYXKKw = 600;
    public static final TaskDescription DbNXlk = new TaskDescription();
    public static final ActionBar ejfBZ = new ActionBar();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<sNJ, Unit> KWHzl() {
        return new Function1() { // from class: o.nPp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34040nPe.OLrzqt((sNJ) obj);
            }
        };
    }

    private C34040nPe() {
    }

    public final CoroutineScope EZpvd() {
        CoroutineScope coroutineScope = EZpvd;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        CoroutineScope coroutineScopeGtdfxv = ((sEZ) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), sEZ.class)).gtdfxv();
        EZpvd = coroutineScopeGtdfxv;
        return coroutineScopeGtdfxv;
    }

    static {
        sDZ sdz = sDZ.AEQbTJ;
        OLrzqt = sdz.fARcdN().KWHzl();
        fARcdN = sdz.fARcdN().isConnected();
        djBIcL = FlowKt.filterNotNull(sdz.fARcdN().EZpvd());
        valueOf = FlowLiveDataConversions.asLiveData$default(sdz.AYXKKw().copydefault(), (CoroutineContext) null, 0L, 3, (java.lang.Object) null);
        fetchVPNInfo = FlowLiveDataConversions.asLiveData$default(sdz.AYXKKw().EZpvd(), (CoroutineContext) null, 0L, 3, (java.lang.Object) null);
        AkhnZx = FlowLiveDataConversions.asLiveData$default(sdz.fARcdN().AhwBna(), (CoroutineContext) null, 0L, 3, (java.lang.Object) null);
        AEQbTJ = new Observer() { // from class: o.nPh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C34040nPe.OLrzqt((MessengerConnectionStatus) obj);
            }
        };
        fJNWhG = new Observer() { // from class: o.nPm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C34040nPe.AEQbTJ((java.lang.String) obj);
            }
        };
        isConnected = new Observer() { // from class: o.nPk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C34040nPe.gEmmrt((java.lang.Integer) obj);
            }
        };
        values = new Observer() { // from class: o.nPi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C34040nPe.KWHzl((java.lang.Integer) obj);
            }
        };
        AhwBna = new Observer() { // from class: o.nPj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C34040nPe.AEQbTJ((java.lang.Integer) obj);
            }
        };
        KWHzl = 8;
    }

    /* JADX INFO: renamed from: o.nPe$TaskDescription */
    public static final class TaskDescription implements mNK {
        @Override // o.mNK
        public void bj_() {
        }

        @Override // o.mNK
        public void AEQbTJ() {
            C55326xho.toastWithFailedIcon$default("No permission to show IM floating window", 0, 1, (java.lang.Object) null);
        }
    }

    public final android.view.View AEQbTJ(android.content.Context context) {
        android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(C35399nuc.Dialog.aKhcqp, (android.view.ViewGroup) null);
        Intrinsics.copydefault(viewInflate);
        KWHzl(viewInflate);
        return viewInflate;
    }

    public final void KWHzl(android.view.View view) {
        ((android.widget.ImageView) view.findViewById(C35399nuc.StateListAnimator.RuDPQV)).setOnClickListener(new View.OnClickListener() { // from class: o.nPl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C34040nPe.EZpvd(view2);
            }
        });
    }

    public static final void EZpvd(android.view.View view) {
        C43246rlf.OLrzqt.valueOf().getSharedPreferences("config", 0).edit().putBoolean("IM_DEBUG_WINDOW", false).apply();
        copydefault.copydefault();
    }

    /* JADX INFO: renamed from: o.nPe$ActionBar */
    public static final class ActionBar implements mNN {
        @Override // o.mNN
        public void AYXKKw() {
        }

        @Override // o.mNN
        public void EZpvd() {
        }

        @Override // o.mNN
        public void KWHzl() {
        }

        @Override // o.mNN
        public void OLrzqt() {
        }

        @Override // o.mNN
        public void bi_() {
        }

        @Override // o.mNN
        public void copydefault() {
        }

        @Override // o.mNN
        public void OLrzqt(int i, int i2) {
            C34040nPe c34040nPe = C34040nPe.copydefault;
            C34040nPe.gEmmrt = i;
            C34040nPe.AYXKKw = i2;
        }
    }

    public static final void OLrzqt(MessengerConnectionStatus messengerConnectionStatus) {
        android.view.View viewKWHzl;
        Intrinsics.checkNotNullParameter(messengerConnectionStatus, "");
        mNF mnfOLrzqt = mND.OLrzqt("IMWebSocketFloatingWindow");
        android.widget.TextView textView = (mnfOLrzqt == null || (viewKWHzl = mnfOLrzqt.KWHzl()) == null) ? null : (android.widget.TextView) viewKWHzl.findViewById(C35399nuc.StateListAnimator.call);
        messengerConnectionStatus.name();
        if (textView != null) {
            java.lang.Integer.toHexString(textView.hashCode());
        }
        if (textView != null) {
            textView.setText("ws: " + messengerConnectionStatus.name() + " (ref: " + ((java.lang.Object) fARcdN.getValue()) + ")");
        }
    }

    public static final void AEQbTJ(java.lang.String str) {
        android.view.View viewKWHzl;
        mNF mnfOLrzqt = mND.OLrzqt("IMWebSocketFloatingWindow");
        android.widget.TextView textView = (mnfOLrzqt == null || (viewKWHzl = mnfOLrzqt.KWHzl()) == null) ? null : (android.widget.TextView) viewKWHzl.findViewById(C35399nuc.StateListAnimator.call);
        if (textView != null) {
            java.lang.Integer.toHexString(textView.hashCode());
        }
        if (textView != null) {
            textView.setText("ws: " + OLrzqt.getValue() + " (ref: " + str + ")");
        }
    }

    public static final void gEmmrt(java.lang.Integer num) {
        android.view.View viewKWHzl;
        mNF mnfOLrzqt = mND.OLrzqt("IMWebSocketFloatingWindow");
        android.widget.TextView textView = (mnfOLrzqt == null || (viewKWHzl = mnfOLrzqt.KWHzl()) == null) ? null : (android.widget.TextView) viewKWHzl.findViewById(C35399nuc.StateListAnimator.DaRZkR);
        if (textView != null) {
            textView.setText("total unread: " + num);
        }
    }

    public static final void KWHzl(java.lang.Integer num) {
        android.view.View viewKWHzl;
        mNF mnfOLrzqt = mND.OLrzqt("IMWebSocketFloatingWindow");
        android.widget.TextView textView = (mnfOLrzqt == null || (viewKWHzl = mnfOLrzqt.KWHzl()) == null) ? null : (android.widget.TextView) viewKWHzl.findViewById(C35399nuc.StateListAnimator.QWpYiD);
        if (textView != null) {
            textView.setText("total message: " + num);
        }
    }

    public static final Unit OLrzqt(sNJ snj) {
        android.view.View viewKWHzl;
        Intrinsics.checkNotNullParameter(snj, "");
        mNF mnfOLrzqt = mND.OLrzqt("IMWebSocketFloatingWindow");
        android.widget.TextView textView = (mnfOLrzqt == null || (viewKWHzl = mnfOLrzqt.KWHzl()) == null) ? null : (android.widget.TextView) viewKWHzl.findViewById(C35399nuc.StateListAnimator.DGgnkA);
        java.lang.String strName = snj.copydefault().name();
        java.lang.String str = snj.copydefault() != ConversationSyncStatus.Syncing ? ": " + snj.OLrzqt() + com.ibm.icu.text.DateFormat.MINUTE_SECOND : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = strName + str;
        if (textView != null) {
            java.lang.Integer.toHexString(textView.hashCode());
        }
        if (textView != null) {
            java.lang.String lowerCase = str2.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            textView.setText(lowerCase);
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(java.lang.Integer num) {
        android.view.View viewKWHzl;
        mNF mnfOLrzqt = mND.OLrzqt("IMWebSocketFloatingWindow");
        android.widget.TextView textView = (mnfOLrzqt == null || (viewKWHzl = mnfOLrzqt.KWHzl()) == null) ? null : (android.widget.TextView) viewKWHzl.findViewById(C35399nuc.StateListAnimator.OTwTPd);
        java.lang.String str = "conversation count: " + num;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final boolean OLrzqt() {
        mNF mnfOLrzqt = mND.OLrzqt("IMWebSocketFloatingWindow");
        return mnfOLrzqt != null && mnfOLrzqt.values();
    }

    public final void copydefault() {
        mNF mnfOLrzqt = mND.OLrzqt("IMWebSocketFloatingWindow");
        if (mnfOLrzqt != null) {
            OLrzqt.removeObserver(AEQbTJ);
            fARcdN.removeObserver(fJNWhG);
            mnfOLrzqt.djBIcL();
        }
    }

    public final void valueOf() {
        android.content.SharedPreferences sharedPreferences = C43246rlf.OLrzqt.valueOf().getSharedPreferences("config", 0);
        boolean z = !sharedPreferences.getBoolean("IM_DEBUG_WINDOW", false);
        sharedPreferences.edit().putBoolean("IM_DEBUG_WINDOW", z).apply();
        AEQbTJ(z);
    }

    public static /* synthetic */ void showOrHide$default(C34040nPe c34040nPe, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = C43246rlf.OLrzqt.valueOf().getSharedPreferences("config", 0).getBoolean("IM_DEBUG_WINDOW", false);
        }
        c34040nPe.AEQbTJ(z);
    }

    public final void AEQbTJ(boolean z) {
        if (z) {
            gEmmrt();
        } else {
            copydefault();
        }
    }

    public final void gEmmrt() {
        if (OLrzqt()) {
            return;
        }
        android.app.Application applicationValueOf = C43246rlf.OLrzqt.valueOf();
        mND.KWHzl(applicationValueOf).EZpvd(AEQbTJ(applicationValueOf)).AEQbTJ("IMWebSocketFloatingWindow").AEQbTJ(TypedValues.TransitionType.TYPE_DURATION).EZpvd(TypedValues.TransitionType.TYPE_DURATION).copydefault(gEmmrt).OLrzqt(AYXKKw).KWHzl(5).EZpvd(ejfBZ).AEQbTJ(DbNXlk).KWHzl(true).KWHzl();
        mNF mnfOLrzqt = mND.OLrzqt("IMWebSocketFloatingWindow");
        if (mnfOLrzqt != null) {
            mnfOLrzqt.isConnected();
        }
        OLrzqt.observeForever(AEQbTJ);
        fARcdN.observeForever(fJNWhG);
        valueOf.observeForever(AhwBna);
        fetchVPNInfo.observeForever(isConnected);
        AkhnZx.observeForever(values);
        BuildersKt__Builders_commonKt.launch$default(EZpvd(), sDN.copydefault.AEQbTJ(), null, new IMWebSocketFloatingWindowController$show$1(null), 2, null);
    }
}

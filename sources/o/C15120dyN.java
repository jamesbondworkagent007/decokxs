package o;

import android.view.View;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dyN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C15120dyN extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public java.util.ArrayList<java.lang.String> AEQbTJ;
    public java.lang.Long AhwBna;
    public dMB EZpvd;
    public boolean copydefault;
    public C15119dyM djBIcL;
    public float OLrzqt = 0.95f;
    public C59534zip AYXKKw = new C59534zip(new java.util.ArrayList(0));
    public java.lang.String valueOf = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.dyN$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dyN.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.dyN$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C15120dyN newInstance$default(TaskDescription taskDescription, java.lang.String str, long j, java.util.ArrayList arrayList, boolean z, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                arrayList = null;
            }
            java.util.ArrayList arrayList2 = arrayList;
            if ((i & 8) != 0) {
                z = false;
            }
            return taskDescription.KWHzl(str, j, arrayList2, z);
        }

        public final C15120dyN KWHzl(@NotNull java.lang.String str, long j, java.util.ArrayList<java.lang.String> arrayList, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            C15120dyN c15120dyN = new C15120dyN();
            android.os.Bundle bundle = new android.os.Bundle();
            if (arrayList != null) {
                bundle.putStringArrayList("contract_list", arrayList);
            }
            bundle.putLong("selectChainId", j);
            bundle.putString("walletId", str);
            bundle.putBoolean("isDarkMode", z);
            c15120dyN.setArguments(bundle);
            return c15120dyN;
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            java.lang.String string = arguments.getString("walletId");
            if (string == null) {
                string = "";
            }
            this.valueOf = string;
            this.AEQbTJ = arguments.getStringArrayList("contract_list");
            this.AhwBna = java.lang.Long.valueOf(arguments.getLong("selectChainId"));
            this.copydefault = arguments.getBoolean("isDarkMode");
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        android.widget.TextView textView;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        wYC wyc;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.view.ContextThemeWrapper contextThemeWrapper = new android.view.ContextThemeWrapper(getContext(), dLX.FragmentManager.AEQbTJ);
        if (this.copydefault) {
            contextThemeWrapper = new android.view.ContextThemeWrapper(getContext(), dLX.FragmentManager.EZpvd);
        }
        dMB dmbEZpvd = dMB.EZpvd(getLayoutInflater().cloneInContext(contextThemeWrapper), constraintLayout, true);
        this.EZpvd = dmbEZpvd;
        if (dmbEZpvd != null && (wyc = dmbEZpvd.OLrzqt) != null) {
            wyc.setOnClickListener(new StateListAnimator(wyc, 1000L, this));
        }
        dMB dmb = this.EZpvd;
        if (dmb != null && (recyclerView4 = dmb.KWHzl) != null) {
            recyclerView4.setHasFixedSize(true);
        }
        dMB dmb2 = this.EZpvd;
        if (dmb2 != null && (recyclerView3 = dmb2.KWHzl) != null) {
            recyclerView3.setLayoutManager(new LinearLayoutManager(getActivity()));
        }
        dMB dmb3 = this.EZpvd;
        if (dmb3 != null && (recyclerView2 = dmb3.KWHzl) != null) {
            recyclerView2.addItemDecoration(new C6987aZj(C55298xhM.dp2px$default(21.0f, null, 1, null), 0));
        }
        dMB dmb4 = this.EZpvd;
        if (dmb4 != null && (recyclerView = dmb4.KWHzl) != null) {
            recyclerView.setAdapter(this.AYXKKw);
        }
        C15119dyM c15119dyM = new C15119dyM(this);
        this.djBIcL = c15119dyM;
        C59534zip c59534zip = this.AYXKKw;
        Intrinsics.copydefault(c15119dyM);
        c59534zip.register(InterfaceC9742bbN.class, c15119dyM);
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().OLrzqt(this.valueOf);
        if (interfaceC9738bbJOLrzqt != null) {
            dMB dmb5 = this.EZpvd;
            if (dmb5 != null) {
                ComponentCallbacks2C5333Nr componentCallbacks2C5333NrEZpvd = Glide.EZpvd(this);
                java.lang.String strAEQbTJ = interfaceC9738bbJOLrzqt.AEQbTJ();
                componentCallbacks2C5333NrEZpvd.KWHzl(strAEQbTJ != null ? new wXL(strAEQbTJ, 0, 2, null) : null).gEmmrt().KWHzl(C52761wXj.Activity.scanPackages).EZpvd(dmb5.isConnected);
                dmb5.gEmmrt.setText(interfaceC9738bbJOLrzqt.AYXKKw());
                android.widget.TextView textView2 = dmb5.djBIcL;
                C15196dzk c15196dzk = C15196dzk.KWHzl;
                java.lang.Long l = this.AhwBna;
                Intrinsics.copydefault(l);
                textView2.setText(c15196dzk.OLrzqt(interfaceC9738bbJOLrzqt, l.longValue()));
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList<java.lang.String> arrayList2 = this.AEQbTJ;
            if (arrayList2 != null) {
                for (java.lang.String str : arrayList2) {
                    InterfaceC9737bbI interfaceC9737bbICopydefault = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).copydefault();
                    Intrinsics.copydefault((java.lang.Object) str);
                    InterfaceC9731bbC interfaceC9731bbCKWHzl = interfaceC9737bbICopydefault.KWHzl(str, C33129mqd.valueOf(this.AhwBna), true);
                    java.lang.Long lValueOf = interfaceC9731bbCKWHzl != null ? java.lang.Long.valueOf(interfaceC9731bbCKWHzl.AhwBna()) : null;
                    if (lValueOf != null) {
                        lValueOf.longValue();
                        InterfaceC9742bbN interfaceC9742bbNCopydefault = interfaceC9738bbJOLrzqt.copydefault(lValueOf.longValue(), null, true);
                        if (interfaceC9742bbNCopydefault != null) {
                            arrayList.add(interfaceC9742bbNCopydefault);
                        }
                    }
                }
            }
            java.util.Iterator it = arrayList.iterator();
            double dAEQbTJ = AudioStats.AUDIO_AMPLITUDE_NONE;
            while (it.hasNext()) {
                dAEQbTJ += C33129mqd.AEQbTJ(((InterfaceC9742bbN) it.next()).AhwBna());
            }
            dMB dmb6 = this.EZpvd;
            if (dmb6 != null && (textView = dmb6.valueOf) != null) {
                textView.setText(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault(java.lang.String.valueOf(dAEQbTJ)));
            }
            this.AYXKKw.setItems(arrayList);
            this.AYXKKw.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: o.dyN$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C15120dyN AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C15120dyN c15120dyN) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c15120dyN;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }
}

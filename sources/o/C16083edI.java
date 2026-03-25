package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.edI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16083edI extends RecyclerView.Adapter<TaskDescription> {
    public final InterfaceC17407fEe AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public final Function1<CustomChainMeta, Unit> EZpvd;
    public final Function1<CustomChainMeta, Unit> KWHzl;
    public final int OLrzqt;
    public final java.util.List<CustomChainMeta> copydefault;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (r12v0 java.util.List)
  (r13v0 o.fEe)
  (r14v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r18v0 kotlin.jvm.functions.Function1))
  (r19v0 kotlin.jvm.functions.Function1)
 A[MD:(java.util.List<com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta>, o.fEe, int, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta, kotlin.Unit>):void (m)] (LINE:16) call: o.edI.<init>(java.util.List, o.fEe, int, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C16083edI(java.util.List list, InterfaceC17407fEe interfaceC17407fEe, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, Function1 function1, Function1 function12, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, interfaceC17407fEe, i, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? null : function1, function12);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C16083edI(@NotNull java.util.List<CustomChainMeta> list, @NotNull InterfaceC17407fEe interfaceC17407fEe, int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, Function1<? super CustomChainMeta, Unit> function1, @NotNull Function1<? super CustomChainMeta, Unit> function12) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(interfaceC17407fEe, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.copydefault = list;
        this.AEQbTJ = interfaceC17407fEe;
        this.OLrzqt = i;
        this.AYXKKw = str;
        this.AhwBna = str2;
        this.valueOf = str3;
        this.EZpvd = function1;
        this.KWHzl = function12;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C16748epl c16748eplCopydefault = C16748epl.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c16748eplCopydefault, "");
        return new TaskDescription(c16748eplCopydefault, this.AEQbTJ, this.OLrzqt, this.EZpvd, this.KWHzl);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.copydefault.size();
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, int i) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        taskDescription.OLrzqt(this.AYXKKw);
        taskDescription.copydefault(this.AhwBna);
        taskDescription.EZpvd(this.valueOf);
        taskDescription.AEQbTJ(this.copydefault.get(i));
    }

    /* JADX INFO: renamed from: o.edI$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final InterfaceC17407fEe AEQbTJ;
        public java.lang.String AhwBna;
        public final Function1<CustomChainMeta, Unit> EZpvd;
        public final int KWHzl;
        public final C16748epl OLrzqt;
        public final Function1<CustomChainMeta, Unit> copydefault;
        public java.lang.String gEmmrt;
        public java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AhwBna = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.valueOf = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(@NotNull C16748epl c16748epl, @NotNull InterfaceC17407fEe interfaceC17407fEe, int i, Function1<? super CustomChainMeta, Unit> function1, @NotNull Function1<? super CustomChainMeta, Unit> function12) {
            super(c16748epl.getRoot());
            Intrinsics.checkNotNullParameter(c16748epl, "");
            Intrinsics.checkNotNullParameter(interfaceC17407fEe, "");
            Intrinsics.checkNotNullParameter(function12, "");
            this.OLrzqt = c16748epl;
            this.AEQbTJ = interfaceC17407fEe;
            this.KWHzl = i;
            this.copydefault = function1;
            this.EZpvd = function12;
            this.AhwBna = "";
            this.valueOf = "";
            this.gEmmrt = "";
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void AEQbTJ(@NotNull CustomChainMeta customChainMeta) {
            java.lang.String str;
            java.lang.String string;
            java.lang.String strOLrzqt;
            Intrinsics.checkNotNullParameter(customChainMeta, "");
            this.OLrzqt.valueOf.setText(KWHzl(this.AhwBna, customChainMeta.OLrzqt()));
            this.OLrzqt.OLrzqt.setText(customChainMeta.isConnected());
            if (C33129mqd.OLrzqt((java.lang.CharSequence) customChainMeta.valueOf())) {
                strOLrzqt = customChainMeta.valueOf();
            } else {
                java.lang.Character chWlaJM = C59454zhO.wlaJM(customChainMeta.OLrzqt());
                if (chWlaJM == null || (string = chWlaJM.toString()) == null || (strOLrzqt = C9700baY.OLrzqt(string)) == null) {
                    str = "";
                }
                android.widget.ImageView imageView = this.OLrzqt.djBIcL;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                C57659ymb.loadFixSizeBorderImage$default(imageView, str, C52761wXj.TaskDescription.fERRXa, 0.0f, 0.0f, 12, null);
                if (this.KWHzl != 0) {
                    android.widget.ImageView imageView2 = this.OLrzqt.AhwBna;
                    Intrinsics.checkNotNullExpressionValue(imageView2, "");
                    imageView2.setVisibility(0);
                    android.widget.ImageView imageView3 = this.OLrzqt.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(imageView3, "");
                    imageView3.setVisibility(8);
                    android.view.View view = this.OLrzqt.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(view, "");
                    view.setVisibility(8);
                    android.widget.ImageView imageView4 = this.OLrzqt.copydefault;
                    Intrinsics.checkNotNullExpressionValue(imageView4, "");
                    imageView4.setVisibility(8);
                } else {
                    android.widget.ImageView imageView5 = this.OLrzqt.AhwBna;
                    Intrinsics.checkNotNullExpressionValue(imageView5, "");
                    imageView5.setVisibility(8);
                    if (Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) customChainMeta.isConnected()) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) java.lang.String.valueOf(customChainMeta.EZpvd()))) {
                        android.widget.ImageView imageView6 = this.OLrzqt.KWHzl;
                        Intrinsics.checkNotNullExpressionValue(imageView6, "");
                        imageView6.setVisibility(0);
                        android.view.View view2 = this.OLrzqt.EZpvd;
                        Intrinsics.checkNotNullExpressionValue(view2, "");
                        view2.setVisibility(0);
                        android.widget.ImageView imageView7 = this.OLrzqt.copydefault;
                        Intrinsics.checkNotNullExpressionValue(imageView7, "");
                        imageView7.setVisibility(0);
                    } else {
                        android.widget.ImageView imageView8 = this.OLrzqt.KWHzl;
                        Intrinsics.checkNotNullExpressionValue(imageView8, "");
                        imageView8.setVisibility(0);
                        android.view.View view3 = this.OLrzqt.EZpvd;
                        Intrinsics.checkNotNullExpressionValue(view3, "");
                        view3.setVisibility(8);
                        android.widget.ImageView imageView9 = this.OLrzqt.copydefault;
                        Intrinsics.checkNotNullExpressionValue(imageView9, "");
                        imageView9.setVisibility(8);
                    }
                }
                android.view.View view4 = this.itemView;
                view4.setOnClickListener(new Activity(view4, 1000L, this, customChainMeta));
                android.widget.ImageView imageView10 = this.OLrzqt.KWHzl;
                imageView10.setOnClickListener(new ViewOnClickListenerC0838TaskDescription(imageView10, 1000L, this, customChainMeta));
            }
            str = strOLrzqt;
            android.widget.ImageView imageView11 = this.OLrzqt.djBIcL;
            Intrinsics.checkNotNullExpressionValue(imageView11, "");
            C57659ymb.loadFixSizeBorderImage$default(imageView11, str, C52761wXj.TaskDescription.fERRXa, 0.0f, 0.0f, 12, null);
            if (this.KWHzl != 0) {
            }
            android.view.View view42 = this.itemView;
            view42.setOnClickListener(new Activity(view42, 1000L, this, customChainMeta));
            android.widget.ImageView imageView102 = this.OLrzqt.KWHzl;
            imageView102.setOnClickListener(new ViewOnClickListenerC0838TaskDescription(imageView102, 1000L, this, customChainMeta));
        }

        public final java.lang.CharSequence KWHzl(java.lang.String str, java.lang.String str2) {
            return (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) ? str2 : this.AEQbTJ.KWHzl(str2, str.toString(), true);
        }

        /* JADX INFO: renamed from: o.edI$TaskDescription$Activity */
        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ CustomChainMeta AEQbTJ;
            public final /* synthetic */ TaskDescription KWHzl;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, TaskDescription taskDescription, CustomChainMeta customChainMeta) {
                this.copydefault = view;
                this.OLrzqt = j;
                this.KWHzl = taskDescription;
                this.AEQbTJ = customChainMeta;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    this.KWHzl.EZpvd.invoke(this.AEQbTJ);
                }
            }
        }

        /* JADX INFO: renamed from: o.edI$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0838TaskDescription implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ TaskDescription EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ CustomChainMeta OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0838TaskDescription(android.view.View view, long j, TaskDescription taskDescription, CustomChainMeta customChainMeta) {
                this.AEQbTJ = view;
                this.KWHzl = j;
                this.EZpvd = taskDescription;
                this.OLrzqt = customChainMeta;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    Function1 function1 = this.EZpvd.copydefault;
                    if (function1 != null) {
                        function1.invoke(this.OLrzqt);
                    }
                }
            }
        }
    }
}

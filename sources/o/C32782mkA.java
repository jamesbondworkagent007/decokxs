package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.security.scanner.EnsecureAppInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32726miy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mkA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32782mkA extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final boolean AEQbTJ;
    public final Function1<EnsecureAppInfo, Unit> AhwBna;
    public final java.util.List<EnsecureAppInfo> EZpvd;
    public final Function1<EnsecureAppInfo, Unit> KWHzl;
    public final Function2<EnsecureAppInfo, java.lang.Boolean, Unit> copydefault;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (r1v0 kotlin.jvm.functions.Function1)
  (r2v0 kotlin.jvm.functions.Function2)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:20) call: o.mkD.<init>():void type: CONSTRUCTOR) : (r4v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super com.okinc.components.security.scanner.EnsecureAppInfo, kotlin.Unit>, kotlin.jvm.functions.Function2<? super com.okinc.components.security.scanner.EnsecureAppInfo, ? super java.lang.Boolean, kotlin.Unit>, boolean, kotlin.jvm.functions.Function1<? super com.okinc.components.security.scanner.EnsecureAppInfo, kotlin.Unit>):void (m)] (LINE:16) call: o.mkA.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, boolean, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C32782mkA(Function1 function1, Function2 function2, boolean z, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, function2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new Function1() { // from class: o.mkD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32782mkA.OLrzqt((EnsecureAppInfo) obj);
            }
        } : function12);
    }

    public static final Unit OLrzqt(EnsecureAppInfo ensecureAppInfo) {
        Intrinsics.checkNotNullParameter(ensecureAppInfo, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.components.security.scanner.EnsecureAppInfo, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.components.security.scanner.EnsecureAppInfo, ? super java.lang.Boolean, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.components.security.scanner.EnsecureAppInfo, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C32782mkA(@NotNull Function1<? super EnsecureAppInfo, Unit> function1, @NotNull Function2<? super EnsecureAppInfo, ? super java.lang.Boolean, Unit> function2, boolean z, @NotNull Function1<? super EnsecureAppInfo, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.AhwBna = function1;
        this.copydefault = function2;
        this.AEQbTJ = z;
        this.KWHzl = function12;
        this.EZpvd = new java.util.ArrayList();
    }

    /* JADX INFO: renamed from: o.mkA$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mkA.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C32726miy.ActionBar.valueOf, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new TaskDescription(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        final EnsecureAppInfo ensecureAppInfo = this.EZpvd.get(i);
        if (viewHolder instanceof TaskDescription) {
            TaskDescription taskDescription = (TaskDescription) viewHolder;
            taskDescription.copydefault(ensecureAppInfo, this.AEQbTJ);
            if (this.AEQbTJ) {
                android.widget.Button buttonEZpvd = taskDescription.EZpvd();
                buttonEZpvd.setOnClickListener(new StateListAnimator(buttonEZpvd, 1000L, this, ensecureAppInfo));
            } else {
                android.widget.Button buttonEZpvd2 = taskDescription.EZpvd();
                buttonEZpvd2.setOnClickListener(new ActionBar(buttonEZpvd2, 1000L, this, ensecureAppInfo));
                taskDescription.AEQbTJ().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.mkB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                        C32782mkA.OLrzqt(this.EZpvd, ensecureAppInfo, compoundButton, z);
                    }
                });
            }
        }
    }

    public static final void OLrzqt(C32782mkA c32782mkA, EnsecureAppInfo ensecureAppInfo, android.widget.CompoundButton compoundButton, boolean z) {
        c32782mkA.copydefault.invoke(ensecureAppInfo, java.lang.Boolean.valueOf(z));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.EZpvd.size();
    }

    /* JADX INFO: renamed from: o.mkA$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final wYK AEQbTJ;
        public final android.widget.ImageView EZpvd;
        public final android.widget.Button KWHzl;
        public final android.widget.ImageView OLrzqt;
        public final android.widget.TextView copydefault;
        public final android.widget.TextView gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final wYK AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.Button EZpvd() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C32726miy.Activity.AkhnZx);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.OLrzqt = (android.widget.ImageView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C32726miy.Activity.ejfBZ);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.EZpvd = (android.widget.ImageView) viewFindViewById2;
            android.view.View viewFindViewById3 = view.findViewById(C32726miy.Activity.AxsJAY);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.copydefault = (android.widget.TextView) viewFindViewById3;
            android.view.View viewFindViewById4 = view.findViewById(C32726miy.Activity.QbewEr);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
            this.gEmmrt = (android.widget.TextView) viewFindViewById4;
            android.view.View viewFindViewById5 = view.findViewById(C32726miy.Activity.copydefault);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
            this.KWHzl = (android.widget.Button) viewFindViewById5;
            android.view.View viewFindViewById6 = view.findViewById(C32726miy.Activity.AwvSrB);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
            this.AEQbTJ = (wYK) viewFindViewById6;
        }

        public static /* synthetic */ void bind$default(TaskDescription taskDescription, EnsecureAppInfo ensecureAppInfo, boolean z, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            taskDescription.copydefault(ensecureAppInfo, z);
        }

        public final void copydefault(@NotNull EnsecureAppInfo ensecureAppInfo, boolean z) {
            Intrinsics.checkNotNullParameter(ensecureAppInfo, "");
            android.content.pm.PackageManager packageManager = this.itemView.getContext().getPackageManager();
            if (ensecureAppInfo.getAppInfo() == null) {
                android.widget.ImageView imageView = this.OLrzqt;
                android.graphics.drawable.Drawable icon = ensecureAppInfo.getIcon();
                if (icon == null) {
                    icon = packageManager.getDefaultActivityIcon();
                    Intrinsics.checkNotNullExpressionValue(icon, "");
                }
                imageView.setImageDrawable(icon);
                this.copydefault.setText(ensecureAppInfo.getAppName());
            } else {
                android.widget.ImageView imageView2 = this.OLrzqt;
                android.content.pm.ApplicationInfo appInfo = ensecureAppInfo.getAppInfo();
                Intrinsics.copydefault(appInfo);
                imageView2.setImageDrawable(appInfo.loadIcon(packageManager));
                android.widget.TextView textView = this.copydefault;
                android.content.pm.ApplicationInfo appInfo2 = ensecureAppInfo.getAppInfo();
                Intrinsics.copydefault(appInfo2);
                textView.setText(appInfo2.loadLabel(packageManager).toString());
            }
            this.gEmmrt.setText(ensecureAppInfo.getPackageName());
            this.EZpvd.setVisibility(8);
            if (z) {
                this.KWHzl.setText(C33070mpX.AYXKKw(C32726miy.Dialog.values));
                this.AEQbTJ.setVisibility(8);
            } else {
                this.KWHzl.setText(C33070mpX.AYXKKw(C32726miy.Dialog.QOLQEE));
                this.AEQbTJ.setVisibility(0);
            }
            this.AEQbTJ.setChecked(false);
        }
    }

    public final void copydefault(@NotNull java.util.List<EnsecureAppInfo> list) {
        java.util.ArrayList arrayList;
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd.clear();
        if (this.AEQbTJ) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (!(!((EnsecureAppInfo) obj).isIgnored())) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (!((EnsecureAppInfo) obj2).isIgnored()) {
                    arrayList.add(obj2);
                }
            }
        }
        this.EZpvd.addAll(arrayList);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: o.mkA$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C32782mkA KWHzl;
        public final /* synthetic */ EnsecureAppInfo OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C32782mkA c32782mkA, EnsecureAppInfo ensecureAppInfo) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = c32782mkA;
            this.OLrzqt = ensecureAppInfo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.AhwBna.invoke(this.OLrzqt);
            }
        }
    }

    /* JADX INFO: renamed from: o.mkA$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C32782mkA EZpvd;
        public final /* synthetic */ EnsecureAppInfo KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C32782mkA c32782mkA, EnsecureAppInfo ensecureAppInfo) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = c32782mkA;
            this.KWHzl = ensecureAppInfo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.KWHzl.invoke(this.KWHzl);
            }
        }
    }
}

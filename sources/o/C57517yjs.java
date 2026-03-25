package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.web3Uilib.uilib3.bean.InfoBottomSheetStyle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yjs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57517yjs extends wXX {
    public java.lang.String AYXKKw = "";
    public Function1<? super java.lang.String, Unit> EZpvd;
    public Function0<Unit> KWHzl;
    public AbstractC57480yjH OLrzqt;
    public Function0<Unit> copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.yjs$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InfoBottomSheetStyle.values().length];
            try {
                iArr[InfoBottomSheetStyle.INFO_LIST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[InfoBottomSheetStyle.DATA_CONTENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX INFO: renamed from: o.yjs$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yjs.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C57517yjs AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull AbstractC57480yjH abstractC57480yjH, Function0<Unit> function0, Function0<Unit> function02, Function1<? super java.lang.String, Unit> function1) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(abstractC57480yjH, "");
            C57517yjs c57517yjs = new C57517yjs();
            c57517yjs.AYXKKw = str;
            c57517yjs.OLrzqt = abstractC57480yjH;
            c57517yjs.copydefault = function0;
            c57517yjs.KWHzl = function02;
            c57517yjs.EZpvd = function1;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("key_title", str);
            if (abstractC57480yjH instanceof C57477yjE) {
                bundle.putInt("key_data_type", InfoBottomSheetStyle.INFO_LIST.ordinal());
                C57477yjE c57477yjE = (C57477yjE) abstractC57480yjH;
                bundle.putInt("key_info_items_size", c57477yjE.EZpvd().size());
                bundle.putString("key_primary_text", c57477yjE.copydefault());
                bundle.putString("key_secondary_text", c57477yjE.AEQbTJ());
                bundle.putBoolean("key_show_close_icon", c57477yjE.OLrzqt());
                int i = 0;
                for (java.lang.Object obj : c57477yjE.EZpvd()) {
                    if (i < 0) {
                        yDY.AYXKKw();
                    }
                    C57481yjI c57481yjI = (C57481yjI) obj;
                    bundle.putString("key_info_item_" + i + "_label", c57481yjI.EZpvd());
                    bundle.putString("key_info_item_" + i + "_value", c57481yjI.copydefault());
                    bundle.putString("key_info_item_" + i + "_tag", c57481yjI.OLrzqt());
                    java.lang.Integer numAEQbTJ = c57481yjI.AEQbTJ();
                    if (numAEQbTJ != null) {
                        bundle.putInt("key_info_item_" + i + "_color", numAEQbTJ.intValue());
                    }
                    i++;
                }
            } else {
                if (!(abstractC57480yjH instanceof C57476yjD)) {
                    throw new NoWhenBranchMatchedException();
                }
                bundle.putInt("key_data_type", InfoBottomSheetStyle.DATA_CONTENT.ordinal());
                C57476yjD c57476yjD = (C57476yjD) abstractC57480yjH;
                bundle.putString("key_content", c57476yjD.EZpvd());
                bundle.putString("key_primary_text", c57476yjD.copydefault());
                bundle.putString("key_secondary_text", c57476yjD.AEQbTJ());
                bundle.putBoolean("key_show_close_icon", c57476yjD.OLrzqt());
            }
            c57517yjs.setArguments(bundle);
            c57517yjs.show(fragmentManager, "OKWInfoBottomSheet");
            return c57517yjs;
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        AbstractC57480yjH c57477yjE;
        java.lang.Integer numValueOf;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            this.AYXKKw = arguments.getString("key_title", "");
            int i = TaskDescription.KWHzl[InfoBottomSheetStyle.getEntries().get(arguments.getInt("key_data_type")).ordinal()];
            if (i == 1) {
                kotlin.ranges.IntRange intRangeAhwBna = C56548yJl.AhwBna(0, arguments.getInt("key_info_items_size"));
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(intRangeAhwBna, 10));
                java.util.Iterator<java.lang.Integer> it = intRangeAhwBna.iterator();
                while (it.hasNext()) {
                    int iNextInt = ((AbstractC56415yEn) it).nextInt();
                    if (arguments.containsKey("key_info_item_" + iNextInt + "_color")) {
                        numValueOf = java.lang.Integer.valueOf(arguments.getInt("key_info_item_" + iNextInt + "_color"));
                    } else {
                        numValueOf = null;
                    }
                    java.lang.String string = arguments.getString("key_info_item_" + iNextInt + "_label", "");
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    arrayList.add(new C57481yjI(string, arguments.getString("key_info_item_" + iNextInt + "_value", ""), numValueOf, arguments.getString("key_info_item_" + iNextInt + "_tag", "")));
                }
                java.lang.String string2 = arguments.getString("key_primary_text", "");
                Intrinsics.checkNotNullExpressionValue(string2, "");
                java.lang.String string3 = arguments.getString("key_secondary_text", "");
                Intrinsics.checkNotNullExpressionValue(string3, "");
                c57477yjE = new C57477yjE(arrayList, string2, string3, arguments.getBoolean("key_show_close_icon"));
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                java.lang.String string4 = arguments.getString("key_content", "");
                Intrinsics.checkNotNullExpressionValue(string4, "");
                java.lang.String string5 = arguments.getString("key_primary_text", "");
                Intrinsics.checkNotNullExpressionValue(string5, "");
                java.lang.String string6 = arguments.getString("key_secondary_text", "");
                Intrinsics.checkNotNullExpressionValue(string6, "");
                c57477yjE = new C57476yjD(string4, string5, string6, arguments.getBoolean("key_show_close_icon"));
            }
            this.OLrzqt = c57477yjE;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setTitle(this.AYXKKw);
        android.os.Bundle arguments = getArguments();
        wxq.setCloseVisibility(arguments != null ? arguments.getBoolean("key_show_close_icon") : false);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new StateListAnimator(imageViewKWHzl, 1000L, this));
        wxq.setStyle(1);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AbstractC57480yjH abstractC57480yjH = this.OLrzqt;
        if (abstractC57480yjH == null) {
            return;
        }
        if (abstractC57480yjH instanceof C57477yjE) {
            AEQbTJ(constraintLayout, (C57477yjE) abstractC57480yjH);
        } else {
            if (!(abstractC57480yjH instanceof C57476yjD)) {
                throw new NoWhenBranchMatchedException();
            }
            OLrzqt(constraintLayout, (C57476yjD) abstractC57480yjH);
        }
    }

    public final void AEQbTJ(ConstraintLayout constraintLayout, C57477yjE c57477yjE) {
        C57417yhy c57417yhyEZpvd = C57417yhy.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
        Intrinsics.checkNotNullExpressionValue(c57417yhyEZpvd, "");
        java.lang.String strCopydefault = c57477yjE.copydefault();
        java.lang.String strAEQbTJ = c57477yjE.AEQbTJ();
        wYF wyf = c57417yhyEZpvd.EZpvd;
        Intrinsics.checkNotNullExpressionValue(wyf, "");
        copydefault(strCopydefault, strAEQbTJ, wyf);
        c57417yhyEZpvd.copydefault.setLayoutManager(new LinearLayoutManager(requireContext()));
        c57417yhyEZpvd.copydefault.setAdapter(new C57474yjB(c57477yjE.EZpvd(), new Function1() { // from class: o.yjq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57517yjs.EZpvd(this.EZpvd, (java.lang.String) obj);
            }
        }));
    }

    public static final Unit EZpvd(C57517yjs c57517yjs, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Function1<? super java.lang.String, Unit> function1 = c57517yjs.EZpvd;
        if (function1 != null) {
            function1.invoke(str);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(ConstraintLayout constraintLayout, C57476yjD c57476yjD) {
        C57418yhz c57418yhzEZpvd = C57418yhz.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
        Intrinsics.checkNotNullExpressionValue(c57418yhzEZpvd, "");
        java.lang.String strCopydefault = c57476yjD.copydefault();
        java.lang.String strAEQbTJ = c57476yjD.AEQbTJ();
        wYF wyf = c57418yhzEZpvd.EZpvd;
        Intrinsics.checkNotNullExpressionValue(wyf, "");
        copydefault(strCopydefault, strAEQbTJ, wyf);
        c57418yhzEZpvd.AEQbTJ.setText(c57476yjD.EZpvd());
        AppCompatTextView appCompatTextView = c57418yhzEZpvd.AEQbTJ;
        appCompatTextView.setOnClickListener(new LoaderManager(appCompatTextView, 1000L, this, c57476yjD));
    }

    /* JADX INFO: renamed from: o.yjs$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C57517yjs AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C57517yjs c57517yjs) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = c57517yjs;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function0 function0 = this.AEQbTJ.KWHzl;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.yjs$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C57517yjs OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C57517yjs c57517yjs) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = c57517yjs;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function0 function0 = this.OLrzqt.copydefault;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.yjs$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C57517yjs EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C57476yjD copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C57517yjs c57517yjs, C57476yjD c57476yjD) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c57517yjs;
            this.copydefault = c57476yjD;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function1 function1 = this.EZpvd.EZpvd;
                if (function1 != null) {
                    function1.invoke(this.copydefault.EZpvd());
                }
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.yjs$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C57517yjs EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C57517yjs c57517yjs) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c57517yjs;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.dismiss();
            }
        }
    }

    public final void copydefault(java.lang.String str, java.lang.String str2, wYF wyf) {
        boolean z = str.length() > 0 && this.copydefault != null;
        boolean z2 = str2.length() > 0 && this.KWHzl != null;
        wyf.setType(14);
        wyf.setVisibility((z || z2) ? 0 : 8);
        if (z) {
            wyf.setPrimaryText(str);
            C52794wYp c52794wYpCopydefault = wyf.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setOKDSType(257);
                c52794wYpCopydefault.setVisibility(0);
                c52794wYpCopydefault.setOnClickListener(new Application(c52794wYpCopydefault, 1000L, this));
            }
        }
        if (z2) {
            wyf.setSecondaryText(str2);
            C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setOKDSType(260);
                c52794wYpAEQbTJ.setVisibility(0);
                c52794wYpAEQbTJ.setOnClickListener(new Activity(c52794wYpAEQbTJ, 1000L, this));
            }
        }
    }
}

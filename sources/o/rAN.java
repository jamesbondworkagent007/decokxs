package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CheckUKRiskStatusResponse;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Content;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Page;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PrimaryButton;
import com.okinc.ok_kyc_core.data.remote.networkmodel.RiskStatus;
import com.okinc.ok_kyc_core.data.remote.networkmodel.SecondaryButton;
import com.okinc.ok_kyc_core_api.ResultBackStatus;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import o.rAO;
import o.rSF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rAN extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public int AEQbTJ = -1;
    public CheckUKRiskStatusResponse AYXKKw;
    public AbstractC43838rwo EZpvd;
    public RiskStatus KWHzl;
    public rAO copydefault;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RiskStatus.values().length];
            try {
                iArr[RiskStatus.QUESTION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RiskStatus.FINAL_CONSENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[ButtonStyle.values().length];
            try {
                iArr2[ButtonStyle.Primary.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[ButtonStyle.Secondary.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[ButtonStyle.Tertiary.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            EZpvd = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final rAO AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(rAO rao) {
        this.copydefault = rao;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rAN.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ rAN newInstance$default(Activity activity, android.os.Bundle bundle, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bundle = new android.os.Bundle();
            }
            return activity.AEQbTJ(bundle);
        }

        public final rAN AEQbTJ(android.os.Bundle bundle) {
            rAN ran = new rAN();
            ran.setArguments(bundle);
            return ran;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        android.os.Bundle arguments = getArguments();
        this.KWHzl = (RiskStatus) (arguments != null ? arguments.getSerializable("EXTRA_ACTION") : null);
        android.os.Bundle arguments2 = getArguments();
        this.AYXKKw = arguments2 != null ? (CheckUKRiskStatusResponse) arguments2.getParcelable("EXTRA_PAGES") : null;
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onHeaderCreated(c52781wYc);
        android.widget.ImageView imageViewOLrzqt = c52781wYc.OLrzqt();
        if (imageViewOLrzqt != null) {
            imageViewOLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.rAT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    rAN.AEQbTJ(this.OLrzqt, view);
                }
            });
        }
    }

    public static final void AEQbTJ(rAN ran, android.view.View view) {
        ran.dismissAllowingStateLoss();
        ran.AEQbTJ = 0;
        rAO rao = ran.copydefault;
        if (rao != null) {
            rao.KWHzl(0);
        }
    }

    public static final class StateListAnimator extends BottomSheetBehavior.BottomSheetCallback {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(android.view.View view, float f) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public StateListAnimator() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(android.view.View view, int i) {
            Intrinsics.checkNotNullParameter(view, "");
            if (i == 5) {
                rAN.this.AEQbTJ = 2;
                rAO raoAEQbTJ = rAN.this.AEQbTJ();
                if (raoAEQbTJ != null) {
                    raoAEQbTJ.KWHzl(rAN.this.AEQbTJ);
                }
            }
        }
    }

    @Override // o.wXX
    public void onSetBehavior(@NotNull BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        super.onSetBehavior(bottomSheetBehavior);
        bottomSheetBehavior.addBottomSheetCallback(new StateListAnimator());
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        this.EZpvd = (AbstractC43838rwo) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.uzCIH, constraintLayout, true);
        EZpvd();
        KWHzl();
    }

    public final void EZpvd() {
        RiskStatus riskStatus = this.KWHzl;
        int i = riskStatus == null ? -1 : TaskDescription.copydefault[riskStatus.ordinal()];
        AbstractC43838rwo abstractC43838rwo = null;
        if (i == 1) {
            AbstractC43838rwo abstractC43838rwo2 = this.EZpvd;
            if (abstractC43838rwo2 == null) {
                Intrinsics.gEmmrt("");
                abstractC43838rwo2 = null;
            }
            C52794wYp c52794wYp = abstractC43838rwo2.copydefault;
            c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
        } else if (i == 2) {
            AbstractC43838rwo abstractC43838rwo3 = this.EZpvd;
            if (abstractC43838rwo3 == null) {
                Intrinsics.gEmmrt("");
                abstractC43838rwo3 = null;
            }
            C52794wYp c52794wYp2 = abstractC43838rwo3.copydefault;
            c52794wYp2.setOnClickListener(new Application(c52794wYp2, 1000L, this));
        }
        AbstractC43838rwo abstractC43838rwo4 = this.EZpvd;
        if (abstractC43838rwo4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC43838rwo = abstractC43838rwo4;
        }
        abstractC43838rwo.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.rAM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                rAN.KWHzl(this.AEQbTJ, view);
            }
        });
    }

    public static final class PendingIntent implements rAO {
        @Override // o.rAO
        public void copydefault(ResultBackStatus resultBackStatus) {
        }

        public PendingIntent() {
        }

        @Override // o.rAO
        public void copydefault() {
            rAO.ActionBar.KWHzl(this);
        }

        @Override // o.rAO
        public void KWHzl(int i) {
            rAO raoAEQbTJ = rAN.this.AEQbTJ();
            if (raoAEQbTJ != null) {
                raoAEQbTJ.KWHzl(i);
            }
        }
    }

    public static final class FragmentManager implements Function1<java.lang.Boolean, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Boolean bool) {
            EZpvd(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void EZpvd(boolean z) {
            AbstractC43838rwo abstractC43838rwo = rAN.this.EZpvd;
            if (abstractC43838rwo == null) {
                Intrinsics.gEmmrt("");
                abstractC43838rwo = null;
            }
            abstractC43838rwo.copydefault.fIwbmz();
            if (z) {
                rAO raoAEQbTJ = rAN.this.AEQbTJ();
                if (raoAEQbTJ != null) {
                    raoAEQbTJ.copydefault();
                }
                rSF rsf = (rSF) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(rSF.class));
                if (rsf != null) {
                    rSF.Application.refreshFeatureRestrictionRepository$default(rsf, LifecycleOwnerKt.getLifecycleScope(rAN.this), null, 2, null);
                }
                rAN.this.AEQbTJ = 4;
                rAN.this.dismissAllowingStateLoss();
            }
        }
    }

    public static final void KWHzl(rAN ran, android.view.View view) {
        ran.AEQbTJ = 1;
        rAO rao = ran.copydefault;
        if (rao != null) {
            rao.KWHzl(1);
        }
        ran.dismissAllowingStateLoss();
    }

    private final void KWHzl() {
        CheckUKRiskStatusResponse checkUKRiskStatusResponse = this.AYXKKw;
        if (checkUKRiskStatusResponse == null || !C33129mqd.KWHzl((java.util.Collection) checkUKRiskStatusResponse.getPages())) {
            return;
        }
        java.util.List<Page> pages = checkUKRiskStatusResponse.getPages();
        Intrinsics.copydefault(pages);
        Page page = pages.get(0);
        AbstractC43838rwo abstractC43838rwo = this.EZpvd;
        AbstractC43838rwo abstractC43838rwo2 = null;
        if (abstractC43838rwo == null) {
            Intrinsics.gEmmrt("");
            abstractC43838rwo = null;
        }
        abstractC43838rwo.KWHzl.setText(page.getTitle());
        if (C33129mqd.KWHzl((java.util.Collection) page.getContent())) {
            java.util.List<Content> content = page.getContent();
            Intrinsics.copydefault(content);
            Content content2 = content.get(0);
            if (content2 != null) {
                java.lang.String text = content2.getText();
                if (text == null) {
                    text = "";
                }
                java.util.HashMap map = new java.util.HashMap();
                java.util.HashMap<java.lang.String, java.lang.String> bold = content2.getBold();
                if (bold != null) {
                    for (Map.Entry<java.lang.String, java.lang.String> entry : bold.entrySet()) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
                java.util.HashMap<java.lang.String, java.lang.String> ukLink = content2.getUkLink();
                if (ukLink != null) {
                    for (Map.Entry<java.lang.String, java.lang.String> entry2 : ukLink.entrySet()) {
                        map.put(entry2.getKey(), entry2.getValue());
                    }
                }
                java.lang.CharSequence charSequenceOLrzqt = C33069mpW.OLrzqt(text, map);
                java.util.HashMap<java.lang.String, java.lang.String> bold2 = content2.getBold();
                if (bold2 != null) {
                    java.util.Iterator<Map.Entry<java.lang.String, java.lang.String>> it = bold2.entrySet().iterator();
                    while (it.hasNext()) {
                        charSequenceOLrzqt = C33061mpO.setupSpanStyles$default(charSequenceOLrzqt, new java.lang.String[]{it.next().getValue()}, 0, null, false, new Function1() { // from class: o.rAS
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return rAN.OLrzqt((java.util.List) obj);
                            }
                        }, 14, null);
                    }
                }
                java.util.HashMap<java.lang.String, java.lang.String> ukLink2 = content2.getUkLink();
                if (ukLink2 != null) {
                    java.util.Iterator<Map.Entry<java.lang.String, java.lang.String>> it2 = ukLink2.entrySet().iterator();
                    while (it2.hasNext()) {
                        charSequenceOLrzqt = C33061mpO.setupSpanStyles$default(charSequenceOLrzqt, new java.lang.String[]{it2.next().getValue()}, 0, null, false, new Function1() { // from class: o.rAU
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return rAN.KWHzl((java.util.List) obj);
                            }
                        }, 14, null);
                    }
                }
                AbstractC43838rwo abstractC43838rwo3 = this.EZpvd;
                if (abstractC43838rwo3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC43838rwo3 = null;
                }
                abstractC43838rwo3.EZpvd.setText(charSequenceOLrzqt);
                AbstractC43838rwo abstractC43838rwo4 = this.EZpvd;
                if (abstractC43838rwo4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC43838rwo4 = null;
                }
                abstractC43838rwo4.EZpvd.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            }
        }
        AbstractC43838rwo abstractC43838rwo5 = this.EZpvd;
        if (abstractC43838rwo5 == null) {
            Intrinsics.gEmmrt("");
            abstractC43838rwo5 = null;
        }
        C52794wYp c52794wYp = abstractC43838rwo5.copydefault;
        PrimaryButton primaryButton = page.getPrimaryButton();
        c52794wYp.setText(primaryButton != null ? primaryButton.getText() : null);
        AbstractC43838rwo abstractC43838rwo6 = this.EZpvd;
        if (abstractC43838rwo6 == null) {
            Intrinsics.gEmmrt("");
            abstractC43838rwo6 = null;
        }
        C52794wYp c52794wYp2 = abstractC43838rwo6.copydefault;
        PrimaryButton primaryButton2 = page.getPrimaryButton();
        EZpvd(c52794wYp2, primaryButton2 != null ? primaryButton2.getStyle() : null);
        AbstractC43838rwo abstractC43838rwo7 = this.EZpvd;
        if (abstractC43838rwo7 == null) {
            Intrinsics.gEmmrt("");
            abstractC43838rwo7 = null;
        }
        C52794wYp c52794wYp3 = abstractC43838rwo7.copydefault;
        PrimaryButton primaryButton3 = page.getPrimaryButton();
        c52794wYp3.setEnabled(primaryButton3 != null ? Intrinsics.EZpvd(primaryButton3.getEnabled(), java.lang.Boolean.TRUE) : false);
        AbstractC43838rwo abstractC43838rwo8 = this.EZpvd;
        if (abstractC43838rwo8 == null) {
            Intrinsics.gEmmrt("");
            abstractC43838rwo8 = null;
        }
        C52794wYp c52794wYp4 = abstractC43838rwo8.OLrzqt;
        SecondaryButton secondaryButton = page.getSecondaryButton();
        c52794wYp4.setText(secondaryButton != null ? secondaryButton.getText() : null);
        AbstractC43838rwo abstractC43838rwo9 = this.EZpvd;
        if (abstractC43838rwo9 == null) {
            Intrinsics.gEmmrt("");
            abstractC43838rwo9 = null;
        }
        C52794wYp c52794wYp5 = abstractC43838rwo9.OLrzqt;
        SecondaryButton secondaryButton2 = page.getSecondaryButton();
        EZpvd(c52794wYp5, secondaryButton2 != null ? secondaryButton2.getStyle() : null);
        AbstractC43838rwo abstractC43838rwo10 = this.EZpvd;
        if (abstractC43838rwo10 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC43838rwo2 = abstractC43838rwo10;
        }
        C52794wYp c52794wYp6 = abstractC43838rwo2.OLrzqt;
        SecondaryButton secondaryButton3 = page.getSecondaryButton();
        c52794wYp6.setEnabled(secondaryButton3 != null ? Intrinsics.EZpvd(secondaryButton3.getEnabled(), java.lang.Boolean.TRUE) : false);
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ rAN OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, rAN ran) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = ran;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putSerializable("EXTRA_ACTION", this.OLrzqt.KWHzl);
                bundle.putParcelable("EXTRA_PAGES", this.OLrzqt.AYXKKw);
                rAR rarOLrzqt = rAR.Companion.OLrzqt(bundle);
                androidx.fragment.app.FragmentManager parentFragmentManager = this.OLrzqt.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                rarOLrzqt.show(parentFragmentManager);
                rarOLrzqt.EZpvd(this.OLrzqt.new PendingIntent());
                this.OLrzqt.AEQbTJ = 4;
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ rAN EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, rAN ran) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = ran;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                AbstractC43838rwo abstractC43838rwo = this.EZpvd.EZpvd;
                if (abstractC43838rwo == null) {
                    Intrinsics.gEmmrt("");
                    abstractC43838rwo = null;
                }
                C52794wYp.startLoading$default(abstractC43838rwo.copydefault, 0L, 1, null);
                rSF rsf = (rSF) C43251rlk.copydefault(rSF.class);
                LifecycleOwner viewLifecycleOwner = this.EZpvd.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                rsf.AEQbTJ(viewLifecycleOwner, 2, this.EZpvd.new FragmentManager());
            }
        }
    }

    public static final Unit OLrzqt(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.StyleSpan(1));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new C43740ruw(null, 1, 0 == true ? 1 : 0));
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        rAO rao;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        pUU.EZpvd("qjf", "PersonalWarningBottomSheet dismiss closeActionType=" + this.AEQbTJ);
        int i = this.AEQbTJ;
        if (i == 0 || i == 1 || i == 2 || i == 4 || (rao = this.copydefault) == null) {
            return;
        }
        rao.KWHzl(3);
    }

    public final void EZpvd(C52794wYp c52794wYp, ButtonStyle buttonStyle) {
        int i = buttonStyle == null ? -1 : TaskDescription.EZpvd[buttonStyle.ordinal()];
        if (i == 1) {
            if (c52794wYp != null) {
                c52794wYp.setOKDSType(257);
            }
        } else if (i == 2) {
            if (c52794wYp != null) {
                c52794wYp.setOKDSType(260);
            }
        } else if (i == 3 && c52794wYp != null) {
            c52794wYp.setOKDSType(258);
        }
    }
}

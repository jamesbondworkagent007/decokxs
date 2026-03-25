package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.gson.Gson;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonAction;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialog;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.DialogInformation;
import com.okinc.ok_kyc_core.data.remote.networkmodel.QuestionItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import o.rRP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class rRP extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public AbstractC43964rzH AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public ButtonDialog OLrzqt;
    public java.lang.String values;
    public final C43316rmw gEmmrt = new C43316rmw();
    public final java.util.ArrayList<QuestionItem> AhwBna = new java.util.ArrayList<>();
    public java.lang.String copydefault = "";
    public java.lang.String AYXKKw = "";
    public java.util.HashMap<java.lang.String, java.lang.String> djBIcL = new java.util.HashMap<>();
    public java.lang.String valueOf = "";

    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ButtonStyle.values().length];
            try {
                iArr[ButtonStyle.Primary.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonStyle.Secondary.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonStyle.Tertiary.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
            int[] iArr2 = new int[ButtonAction.values().length];
            try {
                iArr2[ButtonAction.Cancel.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            KWHzl = iArr2;
        }
    }

    public rRP() {
        final Function0 function0 = null;
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C42163rIr.class), new Function0<ViewModelStore>() { // from class: com.okinc.ok_kyc_core.presentation.views.kycConfirmation.DismissibleConfirmationBottomSheet$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.ok_kyc_core.presentation.views.kycConfirmation.DismissibleConfirmationBottomSheet$special$$inlined$activityViewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.ok_kyc_core.presentation.views.kycConfirmation.DismissibleConfirmationBottomSheet$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rRP.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final rRP copydefault(@NotNull ButtonDialog buttonDialog, @NotNull java.util.ArrayList<QuestionItem> arrayList, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(buttonDialog, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(str3, "");
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("dialog", buttonDialog), C56390yDp.OLrzqt("questions", arrayList), C56390yDp.OLrzqt(EopTrackEvent.KEY_COR, str), C56390yDp.OLrzqt("playbook", str2), C56390yDp.OLrzqt("playbookParams", map), C56390yDp.OLrzqt("pageId", str3));
            rRP rrp = new rRP();
            rrp.setArguments(bundleBundleOf);
            return rrp;
        }
    }

    private final C42163rIr EZpvd() {
        return (C42163rIr) this.EZpvd.getValue();
    }

    @Override // o.wXX
    public float getHeightScale() {
        android.content.res.Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        float fAEQbTJ = C55302xhQ.AEQbTJ(resources);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        float fOLrzqt = C55298xhM.OLrzqt(20, contextRequireContext);
        Intrinsics.checkNotNullExpressionValue(getResources(), "");
        return (fAEQbTJ - fOLrzqt) / C55302xhQ.AEQbTJ(r3);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        this.OLrzqt = arguments != null ? (ButtonDialog) arguments.getParcelable("dialog") : null;
        android.os.Bundle arguments2 = getArguments();
        java.io.Serializable serializable = arguments2 != null ? arguments2.getSerializable("questions") : null;
        java.util.ArrayList arrayList = serializable instanceof java.util.ArrayList ? (java.util.ArrayList) serializable : null;
        java.lang.String str = "";
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                this.AhwBna.add(QuestionItem.copy$default((QuestionItem) next, null, null, null, 7, null));
            }
        }
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 == null || (string = arguments3.getString(EopTrackEvent.KEY_COR)) == null) {
            string = "";
        }
        this.copydefault = string;
        android.os.Bundle arguments4 = getArguments();
        if (arguments4 == null || (string2 = arguments4.getString("playbook")) == null) {
            string2 = "";
        }
        this.AYXKKw = string2;
        android.os.Bundle arguments5 = getArguments();
        java.io.Serializable serializable2 = arguments5 != null ? arguments5.getSerializable("playbookParams") : null;
        java.util.HashMap<java.lang.String, java.lang.String> map = serializable2 instanceof java.util.HashMap ? (java.util.HashMap) serializable2 : null;
        if (map == null) {
            map = new java.util.HashMap<>();
        }
        this.djBIcL = map;
        android.os.Bundle arguments6 = getArguments();
        if (arguments6 != null && (string3 = arguments6.getString("pageId")) != null) {
            str = string3;
        }
        this.valueOf = str;
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("KycQuitWindow_Full_Page_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rRT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rRP.valueOf(this.OLrzqt, (EventParamsList) obj);
            }
        });
    }

    public static final Unit valueOf(rRP rrp, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("entity_id", ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).AuCTelauCTel(), false);
        eventParamsList.put(EopTrackEvent.KEY_COR, rrp.copydefault, false);
        eventParamsList.put("page_id", rrp.valueOf, false);
        eventParamsList.put("playbook", new C43739ruv().KWHzl(rrp.AYXKKw), false);
        java.lang.String json = new Gson().toJson(rrp.djBIcL);
        Intrinsics.checkNotNullExpressionValue(json, "");
        eventParamsList.put("action_params", json, false);
        java.lang.String str = rrp.djBIcL.get("refreshType");
        eventParamsList.put("refresh_type", str != null ? str : "", false);
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onHeaderCreated(c52781wYc);
        c52781wYc.setType(9);
        android.widget.ImageView imageViewOLrzqt = c52781wYc.OLrzqt();
        if (imageViewOLrzqt != null) {
            imageViewOLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.rRN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    rRP.OLrzqt(this.EZpvd, view);
                }
            });
        }
    }

    public static final void OLrzqt(rRP rrp, android.view.View view) {
        CtaPopUp cta;
        CTAButtonAppModel secondaryButton;
        java.lang.String pageId;
        ButtonDialog buttonDialog = rrp.OLrzqt;
        if (buttonDialog == null || (cta = buttonDialog.getCta()) == null || (secondaryButton = cta.getSecondaryButton()) == null) {
            return;
        }
        MutableLiveData<C43734ruq<kotlin.Pair<CTAButtonAppModel, DialogInformation>>> mutableLiveDataKWHzl = rrp.EZpvd().KWHzl();
        ButtonDialog buttonDialog2 = rrp.OLrzqt;
        if (buttonDialog2 == null || (pageId = buttonDialog2.getPageId()) == null) {
            pageId = "";
        }
        mutableLiveDataKWHzl.setValue(new C43734ruq<>(new kotlin.Pair(secondaryButton, new DialogInformation(pageId, false, null, 4, null))));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        AbstractC43964rzH abstractC43964rzH;
        CTAButtonAppModel secondaryButton;
        CTAButtonAppModel primaryButton;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        this.AEQbTJ = (AbstractC43964rzH) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.DCUTEIddSDPG, constraintLayout, true);
        ButtonDialog buttonDialog = this.OLrzqt;
        if (buttonDialog != null) {
            java.lang.String title = buttonDialog.getTitle();
            if (title != null) {
                AbstractC43964rzH abstractC43964rzH2 = this.AEQbTJ;
                if (abstractC43964rzH2 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC43964rzH2 = null;
                }
                abstractC43964rzH2.OLrzqt.setText(title);
            } else {
                AbstractC43964rzH abstractC43964rzH3 = this.AEQbTJ;
                if (abstractC43964rzH3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC43964rzH3 = null;
                }
                abstractC43964rzH3.OLrzqt.setVisibility(8);
            }
            java.lang.String subtitle = buttonDialog.getSubtitle();
            if (subtitle != null) {
                AbstractC43964rzH abstractC43964rzH4 = this.AEQbTJ;
                if (abstractC43964rzH4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC43964rzH4 = null;
                }
                abstractC43964rzH4.KWHzl.setText(subtitle);
            } else {
                AbstractC43964rzH abstractC43964rzH5 = this.AEQbTJ;
                if (abstractC43964rzH5 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC43964rzH5 = null;
                }
                abstractC43964rzH5.KWHzl.setVisibility(8);
            }
            CtaPopUp cta = buttonDialog.getCta();
            if (cta != null && (primaryButton = cta.getPrimaryButton()) != null) {
                AbstractC43964rzH abstractC43964rzH6 = this.AEQbTJ;
                if (abstractC43964rzH6 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC43964rzH6 = null;
                }
                abstractC43964rzH6.gEmmrt.setVisibility(0);
                AbstractC43964rzH abstractC43964rzH7 = this.AEQbTJ;
                if (abstractC43964rzH7 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC43964rzH7 = null;
                }
                C52794wYp c52794wYp = abstractC43964rzH7.gEmmrt;
                java.lang.String text = primaryButton.getText();
                if (text == null) {
                    text = "";
                }
                c52794wYp.setText(text);
                AbstractC43964rzH abstractC43964rzH8 = this.AEQbTJ;
                if (abstractC43964rzH8 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC43964rzH8 = null;
                }
                C52794wYp c52794wYp2 = abstractC43964rzH8.gEmmrt;
                c52794wYp2.setOnClickListener(new Activity(c52794wYp2, 1000L, this, primaryButton));
                ButtonStyle style = primaryButton.getStyle();
                int i = style == null ? -1 : Application.OLrzqt[style.ordinal()];
                if (i == 1) {
                    AbstractC43964rzH abstractC43964rzH9 = this.AEQbTJ;
                    if (abstractC43964rzH9 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC43964rzH9 = null;
                    }
                    abstractC43964rzH9.gEmmrt.setOKDSType(257);
                } else if (i == 2) {
                    AbstractC43964rzH abstractC43964rzH10 = this.AEQbTJ;
                    if (abstractC43964rzH10 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC43964rzH10 = null;
                    }
                    abstractC43964rzH10.gEmmrt.setOKDSType(260);
                } else if (i == 3) {
                    AbstractC43964rzH abstractC43964rzH11 = this.AEQbTJ;
                    if (abstractC43964rzH11 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC43964rzH11 = null;
                    }
                    abstractC43964rzH11.gEmmrt.setOKDSType(258);
                }
            }
            CtaPopUp cta2 = buttonDialog.getCta();
            if (cta2 != null && (secondaryButton = cta2.getSecondaryButton()) != null) {
                AbstractC43964rzH abstractC43964rzH12 = this.AEQbTJ;
                if (abstractC43964rzH12 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC43964rzH12 = null;
                }
                abstractC43964rzH12.djBIcL.setVisibility(0);
                AbstractC43964rzH abstractC43964rzH13 = this.AEQbTJ;
                if (abstractC43964rzH13 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC43964rzH13 = null;
                }
                C52794wYp c52794wYp3 = abstractC43964rzH13.djBIcL;
                java.lang.String text2 = secondaryButton.getText();
                if (text2 == null) {
                    text2 = "";
                }
                c52794wYp3.setText(text2);
                AbstractC43964rzH abstractC43964rzH14 = this.AEQbTJ;
                if (abstractC43964rzH14 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC43964rzH14 = null;
                }
                C52794wYp c52794wYp4 = abstractC43964rzH14.djBIcL;
                c52794wYp4.setOnClickListener(new TaskDescription(c52794wYp4, 1000L, this, secondaryButton));
                ButtonStyle style2 = secondaryButton.getStyle();
                int i2 = style2 != null ? Application.OLrzqt[style2.ordinal()] : -1;
                if (i2 == 1) {
                    AbstractC43964rzH abstractC43964rzH15 = this.AEQbTJ;
                    if (abstractC43964rzH15 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC43964rzH15 = null;
                    }
                    abstractC43964rzH15.djBIcL.setOKDSType(257);
                } else if (i2 == 2) {
                    AbstractC43964rzH abstractC43964rzH16 = this.AEQbTJ;
                    if (abstractC43964rzH16 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC43964rzH16 = null;
                    }
                    abstractC43964rzH16.djBIcL.setOKDSType(260);
                } else if (i2 == 3) {
                    AbstractC43964rzH abstractC43964rzH17 = this.AEQbTJ;
                    if (abstractC43964rzH17 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC43964rzH17 = null;
                    }
                    abstractC43964rzH17.djBIcL.setOKDSType(258);
                }
                AbstractC43964rzH abstractC43964rzH18 = this.AEQbTJ;
                if (abstractC43964rzH18 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC43964rzH18 = null;
                }
                C52794wYp c52794wYp5 = abstractC43964rzH18.djBIcL;
                java.lang.String str = this.values;
                c52794wYp5.setEnabled(!(str == null || str.length() == 0));
            }
        }
        java.util.ArrayList<QuestionItem> arrayList = this.AhwBna;
        if (arrayList != null) {
            AbstractC43964rzH abstractC43964rzH19 = this.AEQbTJ;
            if (abstractC43964rzH19 == null) {
                Intrinsics.gEmmrt("");
                abstractC43964rzH = null;
            } else {
                abstractC43964rzH = abstractC43964rzH19;
            }
            C31695mAm c31695mAm = abstractC43964rzH.AEQbTJ;
            c31695mAm.setLayoutManager(C33047mpA.KWHzl(c31695mAm.getContext()));
            c31695mAm.setAdapter(this.gEmmrt);
            this.gEmmrt.register(QuestionItem.class, new ActionBar(this, new Function1() { // from class: o.rRR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return rRP.KWHzl(this.AEQbTJ, (QuestionItem) obj);
                }
            }));
            this.gEmmrt.setItems(arrayList);
            this.gEmmrt.notifyDataSetChanged();
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ CTAButtonAppModel OLrzqt;
        public final /* synthetic */ rRP copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, rRP rrp, CTAButtonAppModel cTAButtonAppModel) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = rrp;
            this.OLrzqt = cTAButtonAppModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.copydefault(this.OLrzqt);
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ CTAButtonAppModel EZpvd;
        public final /* synthetic */ rRP OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, rRP rrp, CTAButtonAppModel cTAButtonAppModel) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = rrp;
            this.EZpvd = cTAButtonAppModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.copydefault(this.EZpvd);
            }
        }
    }

    public static final Unit KWHzl(rRP rrp, QuestionItem questionItem) {
        AbstractC43964rzH abstractC43964rzH = null;
        rrp.values = questionItem != null ? questionItem.getId() : null;
        AbstractC43964rzH abstractC43964rzH2 = rrp.AEQbTJ;
        if (abstractC43964rzH2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC43964rzH = abstractC43964rzH2;
        }
        C52794wYp c52794wYp = abstractC43964rzH.djBIcL;
        java.lang.String str = rrp.values;
        c52794wYp.setEnabled(!(str == null || str.length() == 0));
        return Unit.INSTANCE;
    }

    public final void copydefault(CTAButtonAppModel cTAButtonAppModel) {
        java.lang.String pageId;
        ButtonAction action = cTAButtonAppModel.getAction();
        if (action != null && Application.KWHzl[action.ordinal()] == 1) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("KycQuitContinue_Full_Page_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rRO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return rRP.KWHzl(this.EZpvd, (EventParamsList) obj);
                }
            });
            dismissAllowingStateLoss();
            return;
        }
        TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("KycQuitWindow_Full_Page_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rRW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rRP.AEQbTJ(this.EZpvd, (EventParamsList) obj);
            }
        });
        C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C43662rtX.Dialog.RJOkX), 0, 1, (java.lang.Object) null);
        MutableLiveData<C43734ruq<kotlin.Pair<CTAButtonAppModel, DialogInformation>>> mutableLiveDataKWHzl = EZpvd().KWHzl();
        ButtonDialog buttonDialog = this.OLrzqt;
        if (buttonDialog == null || (pageId = buttonDialog.getPageId()) == null) {
            pageId = "";
        }
        mutableLiveDataKWHzl.setValue(new C43734ruq<>(new kotlin.Pair(cTAButtonAppModel, new DialogInformation(pageId, false, null, 4, null))));
        dismissAllowingStateLoss();
    }

    public static final Unit KWHzl(rRP rrp, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("entity_id", ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).AuCTelauCTel(), false);
        eventParamsList.put(EopTrackEvent.KEY_COR, rrp.copydefault, false);
        eventParamsList.put("page_id", rrp.valueOf, false);
        eventParamsList.put("playbook", new C43739ruv().KWHzl(rrp.AYXKKw), false);
        java.lang.String json = new Gson().toJson(rrp.djBIcL);
        Intrinsics.checkNotNullExpressionValue(json, "");
        eventParamsList.put("action_params", json, false);
        java.lang.String str = rrp.djBIcL.get("refreshType");
        eventParamsList.put("refresh_type", str != null ? str : "", false);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(rRP rrp, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("entity_id", ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).AuCTelauCTel(), false);
        eventParamsList.put(EopTrackEvent.KEY_COR, rrp.copydefault, false);
        java.lang.String str = rrp.values;
        if (str == null) {
            str = "";
        }
        eventParamsList.put("question_code", str, false);
        eventParamsList.put("page_id", rrp.valueOf, false);
        eventParamsList.put("playbook", new C43739ruv().KWHzl(rrp.AYXKKw), false);
        java.lang.String json = new Gson().toJson(rrp.djBIcL);
        Intrinsics.checkNotNullExpressionValue(json, "");
        eventParamsList.put("action_params", json, false);
        java.lang.String str2 = rrp.djBIcL.get("refreshType");
        eventParamsList.put("refresh_type", str2 != null ? str2 : "", false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: loaded from: classes23.dex */
    public final class ActionBar extends AbstractC43310rmq<QuestionItem, AbstractC43928ryY> {
        public final /* synthetic */ rRP AEQbTJ;
        public final Function1<QuestionItem, Unit> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C43662rtX.TaskDescription.dUDNAs;
        }

        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.ok_kyc_core.data.remote.networkmodel.QuestionItem, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(@NotNull rRP rrp, Function1<? super QuestionItem, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = rrp;
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC43928ryY> c43312rms, @NotNull final QuestionItem questionItem) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(questionItem, "");
            super.onBindViewHolder((C43312rms) c43312rms, questionItem);
            ((AbstractC43928ryY) c43312rms.OLrzqt()).AEQbTJ.setText(questionItem.getTitle());
            if (Intrinsics.EZpvd(questionItem.isSelected(), java.lang.Boolean.TRUE)) {
                ((AbstractC43928ryY) c43312rms.OLrzqt()).AEQbTJ.setBackgroundResource(C43662rtX.Activity.DbNXlk);
            } else {
                ((AbstractC43928ryY) c43312rms.OLrzqt()).AEQbTJ.setBackgroundResource(C43662rtX.Activity.isConnected);
            }
            android.widget.TextView textView = ((AbstractC43928ryY) c43312rms.OLrzqt()).AEQbTJ;
            final rRP rrp = this.AEQbTJ;
            textView.setOnClickListener(new View.OnClickListener() { // from class: o.rRU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    rRP.ActionBar.AEQbTJ(questionItem, rrp, this, view);
                }
            });
        }

        public static final void AEQbTJ(QuestionItem questionItem, rRP rrp, ActionBar actionBar, android.view.View view) {
            if (Intrinsics.EZpvd(questionItem.isSelected(), java.lang.Boolean.FALSE)) {
                rrp.KWHzl(questionItem.getId());
                actionBar.KWHzl.invoke(questionItem);
            }
        }
    }

    public final void KWHzl(java.lang.String str) {
        java.util.ArrayList<QuestionItem> arrayList = this.AhwBna;
        if (arrayList != null) {
            java.util.Iterator<QuestionItem> it = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                QuestionItem next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                QuestionItem questionItem = next;
                questionItem.setSelected(java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) questionItem.getId())));
            }
            this.gEmmrt.notifyDataSetChanged();
        }
    }
}

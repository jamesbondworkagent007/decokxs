package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.appupdate.api.AppUpdateService;
import com.okinc.business.appupdate.api.IUpdate;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonAction;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialog;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.DialogStyle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ListPickerPopUpAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.SelectPopUpAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UpgradeActionParams;
import com.okinc.ok_kyc_core.presentation.views.accountMerge.PopUpManger$showPdfDialog$4$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C43662rtX;
import o.C52761wXj;
import o.rSF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rQZ {
    public static ActivityResultLauncher<android.content.Intent> EZpvd;
    public static final rQZ KWHzl = new rQZ();
    public static final int OLrzqt = 8;

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ButtonAction.values().length];
            try {
                iArr[ButtonAction.Cancel.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[DialogStyle.values().length];
            try {
                iArr2[DialogStyle.BOTTOM.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr2[DialogStyle.CENTER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr2;
        }
    }

    private rQZ() {
    }

    public final void OLrzqt(@NotNull final FragmentActivity fragmentActivity, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function0, "");
        C43693ruB.OLrzqt("KYC_MergeAccount_Dialog");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(fragmentActivity);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C43662rtX.Dialog.htlTjW));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C43662rtX.Dialog.igXuih));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C43662rtX.Dialog.fjfviF), new View.OnClickListener() { // from class: o.rRm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                rQZ.copydefault(function0, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C43662rtX.Dialog.dUDNAs), new View.OnClickListener() { // from class: o.rRf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                rQZ.EZpvd(fragmentActivity, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C43662rtX.Dialog.UlJrfe), new View.OnClickListener() { // from class: o.rRe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                rQZ.OLrzqt(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(Function0 function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function0.invoke();
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void EZpvd(FragmentActivity fragmentActivity, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        KWHzl.OLrzqt(fragmentActivity);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void OLrzqt(FragmentActivity fragmentActivity) {
        android.content.Intent intentAEQbTJ = ((rSF) C43251rlk.copydefault(rSF.class)).AEQbTJ(fragmentActivity);
        ActivityResultLauncher<android.content.Intent> activityResultLauncher = EZpvd;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(intentAEQbTJ);
        }
    }

    public final void AEQbTJ(@NotNull final FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        EZpvd = fragmentActivity.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.rRc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                rQZ.EZpvd(fragmentActivity, (ActivityResult) obj);
            }
        });
    }

    public static final void EZpvd(FragmentActivity fragmentActivity, ActivityResult activityResult) {
        rSF rsf;
        if (activityResult.getResultCode() != -1 || (rsf = (rSF) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(rSF.class))) == null) {
            return;
        }
        rSF.Application.gotoMain$default(rsf, fragmentActivity, null, 2, null);
    }

    public final void EZpvd() {
        ActivityResultLauncher<android.content.Intent> activityResultLauncher = EZpvd;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        EZpvd = null;
    }

    public final void OLrzqt(FragmentActivity fragmentActivity, @NotNull UpgradeActionParams upgradeActionParams) {
        AppUpdateService appUpdateService;
        Intrinsics.checkNotNullParameter(upgradeActionParams, "");
        C43693ruB.OLrzqt("KYC_Update_Dialog");
        if (!(fragmentActivity instanceof AbstractActivityC33041mov) || (appUpdateService = (AppUpdateService) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(AppUpdateService.class))) == null) {
            return;
        }
        appUpdateService.checkUpdate((AbstractActivityC33041mov) fragmentActivity, false, new IUpdate.DialogInfo(upgradeActionParams.getTitle(), upgradeActionParams.getContent(), null, null, null, null, false, 124, null));
    }

    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.rQZ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showPdfDialog$default(rQZ rqz, android.content.Context context, android.net.Uri uri, java.lang.String str, LifecycleOwner lifecycleOwner, Function0 function0, Function0 function02, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            function0 = new Function0() { // from class: o.rRk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return rQZ.copydefault();
                }
            };
        }
        rqz.KWHzl(context, uri, str, lifecycleOwner, function0, function02);
    }

    public final void KWHzl(@NotNull final android.content.Context context, @NotNull final android.net.Uri uri, @NotNull final java.lang.String str, @NotNull final LifecycleOwner lifecycleOwner, @NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(C43662rtX.TaskDescription.fHqPtx, (android.view.ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        final C55008xbo c55008xbo = (C55008xbo) viewInflate.findViewById(C43662rtX.ActionBar.DMb);
        c55008xbo.setHintText(C33070mpX.AYXKKw(C43662rtX.Dialog.ORxRYg));
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.addTextChangedListener(new TaskDescription(c55008xbo));
        }
        android.widget.LinearLayout linearLayoutAuCTel = c55008xbo.AuCTel();
        if (linearLayoutAuCTel != null) {
            linearLayoutAuCTel.setOnClickListener(new View.OnClickListener() { // from class: o.rRa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    rQZ.KWHzl(booleanRef, c55008xbo, view);
                }
            });
        }
        if (booleanRef.element) {
            C55009xbp c55009xbpFIwbmz = c55008xbo.fIwbmz();
            if (c55009xbpFIwbmz != null) {
                c55009xbpFIwbmz.values();
            }
            C55009xbp c55009xbpFIwbmz2 = c55008xbo.fIwbmz();
            if (c55009xbpFIwbmz2 != null) {
                C55009xbp.replaceFunctionDrawable$default(c55009xbpFIwbmz2, C52761wXj.TaskDescription.ODCBUN, 0, 0, 0, 14, null);
            }
        } else {
            C55009xbp c55009xbpFIwbmz3 = c55008xbo.fIwbmz();
            if (c55009xbpFIwbmz3 != null) {
                c55009xbpFIwbmz3.isConnected();
            }
            C55009xbp c55009xbpFIwbmz4 = c55008xbo.fIwbmz();
            if (c55009xbpFIwbmz4 != null) {
                C55009xbp.replaceFunctionDrawable$default(c55009xbpFIwbmz4, C52761wXj.TaskDescription.invokespecialgBtXYZ, 0, 0, 0, 14, null);
            }
        }
        viewOnClickListenerC54939xaY.EZpvd(viewInflate);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C43662rtX.Dialog.QUSxYX));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C43662rtX.Dialog.QKVWgx));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C43662rtX.Dialog.AuCTelauCTel), new View.OnClickListener() { // from class: o.rRi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                rQZ.OLrzqt(c55008xbo, lifecycleOwner, context, uri, str, objectRef, function02, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C43662rtX.Dialog.wlaJM), new View.OnClickListener() { // from class: o.rRg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                rQZ.EZpvd(function0, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final class TaskDescription implements android.text.TextWatcher {
        public final /* synthetic */ C55008xbo EZpvd;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public TaskDescription(C55008xbo c55008xbo) {
            this.EZpvd = c55008xbo;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            this.EZpvd.values();
        }
    }

    public static final void KWHzl(Ref.BooleanRef booleanRef, C55008xbo c55008xbo, android.view.View view) {
        if (booleanRef.element) {
            C55009xbp c55009xbpFIwbmz = c55008xbo.fIwbmz();
            if (c55009xbpFIwbmz != null) {
                c55009xbpFIwbmz.isConnected();
            }
            C55009xbp c55009xbpFIwbmz2 = c55008xbo.fIwbmz();
            if (c55009xbpFIwbmz2 != null) {
                C55009xbp.replaceFunctionDrawable$default(c55009xbpFIwbmz2, C52761wXj.TaskDescription.invokespecialgBtXYZ, 0, 0, 0, 14, null);
            }
        } else {
            C55009xbp c55009xbpFIwbmz3 = c55008xbo.fIwbmz();
            if (c55009xbpFIwbmz3 != null) {
                c55009xbpFIwbmz3.values();
            }
            C55009xbp c55009xbpFIwbmz4 = c55008xbo.fIwbmz();
            if (c55009xbpFIwbmz4 != null) {
                C55009xbp.replaceFunctionDrawable$default(c55009xbpFIwbmz4, C52761wXj.TaskDescription.ODCBUN, 0, 0, 0, 14, null);
            }
        }
        booleanRef.element = !booleanRef.element;
    }

    public static final void OLrzqt(C55008xbo c55008xbo, LifecycleOwner lifecycleOwner, android.content.Context context, android.net.Uri uri, java.lang.String str, Ref.ObjectRef objectRef, Function0 function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        android.text.Editable text;
        java.lang.String string;
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        java.lang.String string2 = (c55001xbhAkhnZx == null || (text = c55001xbhAkhnZx.getText()) == null || (string = text.toString()) == null) ? null : StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) string).toString();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) string2)) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new PopUpManger$showPdfDialog$4$1(context, uri, str, string2, objectRef, function0, viewOnClickListenerC54939xaY, c55008xbo, null), 3, null);
        }
    }

    public static final void EZpvd(Function0 function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        C43693ruB.OLrzqt("KYC_Encrypt_Pdf_Dialog_Cancel");
        function0.invoke();
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C43693ruB.OLrzqt("KYC_Encrypt_Pdf_Error_Dialog");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C43662rtX.Dialog.QVAiDq));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C43662rtX.Dialog.DTwDnp));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C43662rtX.Dialog.zsXlph), new View.OnClickListener() { // from class: o.rRl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                rQZ.AhwBna(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AhwBna(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void AEQbTJ(@NotNull FragmentActivity fragmentActivity, @NotNull ButtonDialog buttonDialog, @NotNull final Function1<? super CTAButtonAppModel, Unit> function1) {
        final CTAButtonAppModel secondaryButton;
        final CTAButtonAppModel primaryButton;
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(buttonDialog, "");
        Intrinsics.checkNotNullParameter(function1, "");
        DialogStyle position = buttonDialog.getPosition();
        int i = position == null ? -1 : ActionBar.copydefault[position.ordinal()];
        if (i == 1) {
            rRV rrvEZpvd = rRV.Companion.EZpvd(buttonDialog, (192 & 2) != 0 ? null : null, (192 & 4) != 0 ? null : null, (192 & 8) != 0 ? null : null, (192 & 16) != 0 ? null : null, (192 & 32) == 0 ? null : null, (192 & 64) != 0 ? java.lang.Boolean.FALSE : null, (192 & 128) != 0 ? -1 : null);
            androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            rrvEZpvd.show(supportFragmentManager);
            return;
        }
        if (i != 2) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(fragmentActivity);
        if (buttonDialog.getTitle() != null) {
            viewOnClickListenerC54939xaY.setTitle(buttonDialog.getTitle());
        }
        if (C33129mqd.KWHzl((java.util.Collection) buttonDialog.getItems())) {
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(fragmentActivity);
            linearLayout.setOrientation(1);
            androidx.fragment.app.FragmentManager supportFragmentManager2 = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
            rQO rqo = new rQO(supportFragmentManager2, fragmentActivity);
            java.util.List<UIComponentAppModel> items = buttonDialog.getItems();
            Intrinsics.copydefault(items);
            java.util.Iterator it = rQO.getItemViewsForPopUp$default(rqo, fragmentActivity, items, null, 4, null).iterator();
            while (it.hasNext()) {
                linearLayout.addView((android.view.View) it.next());
            }
            viewOnClickListenerC54939xaY.EZpvd(linearLayout);
        } else if (buttonDialog.getSubtitle() != null) {
            viewOnClickListenerC54939xaY.EZpvd(buttonDialog.getSubtitle());
        }
        CtaPopUp cta = buttonDialog.getCta();
        if (cta != null && (primaryButton = cta.getPrimaryButton()) != null) {
            java.lang.String text = buttonDialog.getCta().getPrimaryButton().getText();
            if (text == null) {
                text = "";
            }
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) text, new View.OnClickListener() { // from class: o.rRh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    rQZ.OLrzqt(primaryButton, viewOnClickListenerC54939xaY, function1, view);
                }
            });
        }
        CtaPopUp cta2 = buttonDialog.getCta();
        if (cta2 != null && (secondaryButton = cta2.getSecondaryButton()) != null) {
            java.lang.String text2 = buttonDialog.getCta().getSecondaryButton().getText();
            viewOnClickListenerC54939xaY.AEQbTJ(text2 != null ? text2 : "", new View.OnClickListener() { // from class: o.rRn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    rQZ.AEQbTJ(secondaryButton, viewOnClickListenerC54939xaY, function1, view);
                }
            });
        }
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(CTAButtonAppModel cTAButtonAppModel, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function1 function1, android.view.View view) {
        ButtonAction action = cTAButtonAppModel.getAction();
        if (action != null && ActionBar.AEQbTJ[action.ordinal()] == 1) {
            viewOnClickListenerC54939xaY.dismiss();
        } else {
            function1.invoke(cTAButtonAppModel);
            viewOnClickListenerC54939xaY.dismiss();
        }
    }

    public static final void AEQbTJ(CTAButtonAppModel cTAButtonAppModel, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function1 function1, android.view.View view) {
        ButtonAction action = cTAButtonAppModel.getAction();
        if (action != null && ActionBar.AEQbTJ[action.ordinal()] == 1) {
            viewOnClickListenerC54939xaY.dismiss();
        } else {
            function1.invoke(cTAButtonAppModel);
            viewOnClickListenerC54939xaY.dismiss();
        }
    }

    public final void KWHzl(@NotNull FragmentActivity fragmentActivity, @NotNull SelectPopUpAppModel selectPopUpAppModel) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(selectPopUpAppModel, "");
        C42423rSh c42423rShOLrzqt = C42423rSh.Companion.OLrzqt(selectPopUpAppModel);
        androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c42423rShOLrzqt.show(supportFragmentManager);
    }

    public final void copydefault(@NotNull android.content.Context context, java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.EZpvd(str);
        java.lang.String string = context.getString(C43662rtX.Dialog.zsXlph);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.rRj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                rQZ.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void OLrzqt(@NotNull FragmentActivity fragmentActivity, @NotNull ListPickerPopUpAppModel listPickerPopUpAppModel, @NotNull PageComponentAppModel pageComponentAppModel) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(listPickerPopUpAppModel, "");
        Intrinsics.checkNotNullParameter(pageComponentAppModel, "");
        C42430rSo c42430rSoKWHzl = C42430rSo.Companion.KWHzl(listPickerPopUpAppModel, pageComponentAppModel);
        androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c42430rSoKWHzl.show(supportFragmentManager);
    }
}

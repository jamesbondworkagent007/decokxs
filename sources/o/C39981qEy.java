package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ViewKt;
import com.okinc.im.bean.SearchResultData;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qEy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39981qEy extends AbstractC39964qEh<C40004qFu, C42886req> {
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.qEB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C39981qEy.copydefault();
        }
    });
    private static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.qEy$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qEy.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final InterfaceC35180nqU OLrzqt() {
        return (InterfaceC35180nqU) this.copydefault.getValue();
    }

    public static final InterfaceC35180nqU copydefault() {
        return (InterfaceC35180nqU) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC35180nqU.class));
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C42886req AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42886req c42886reqAEQbTJ = C42886req.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42886reqAEQbTJ, "");
        return c42886reqAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void AEQbTJ(@NotNull final C42886req c42886req, int i, @NotNull final C40004qFu c40004qFu) {
        java.lang.Integer groupEntityType;
        OfficialTagInfo officialTagInfo;
        Intrinsics.checkNotNullParameter(c42886req, "");
        Intrinsics.checkNotNullParameter(c40004qFu, "");
        AppCompatTextView appCompatTextView = c42886req.valueOf;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        java.lang.String strEZpvd = c40004qFu.EZpvd();
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        AEQbTJ(appCompatTextView, strEZpvd);
        C41431qqg.AEQbTJ(c42886req.KWHzl, C33129mqd.OLrzqt((java.lang.CharSequence) c40004qFu.KWHzl()), (Function1<? super AppCompatTextView, Unit>) new Function1() { // from class: o.qEz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39981qEy.OLrzqt(this.EZpvd, c42886req, c40004qFu, (AppCompatTextView) obj);
            }
        });
        SearchResultData searchResultDataOLrzqt = c40004qFu.OLrzqt();
        java.lang.String strCopydefault = null;
        Unit unit = null;
        int i2 = 8;
        if (searchResultDataOLrzqt instanceof SearchResultData.ChatAndContact) {
            InterfaceC35180nqU interfaceC35180nqUOLrzqt = OLrzqt();
            if (interfaceC35180nqUOLrzqt != null) {
                C35893oHp c35893oHp = c42886req.copydefault;
                Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
                interfaceC35180nqUOLrzqt.copydefault(c35893oHp, (SearchResultData.ChatAndContact) c40004qFu.OLrzqt());
            }
            OKConversation conversation = ((SearchResultData.ChatAndContact) c40004qFu.OLrzqt()).getConversation();
            if (conversation != null && (officialTagInfo = conversation.getOfficialTagInfo()) != null) {
                AppCompatTextView appCompatTextView2 = c42886req.EZpvd;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
                appCompatTextView2.setVisibility(0);
                InterfaceC35180nqU interfaceC35180nqUOLrzqt2 = OLrzqt();
                if (interfaceC35180nqUOLrzqt2 != null) {
                    AppCompatTextView appCompatTextView3 = c42886req.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
                    interfaceC35180nqUOLrzqt2.EZpvd(appCompatTextView3, officialTagInfo);
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                }
                AppCompatImageView appCompatImageView = c42886req.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
                OKConversation conversation2 = ((SearchResultData.ChatAndContact) c40004qFu.OLrzqt()).getConversation();
                if (conversation2 == null) {
                    appCompatImageView.setVisibility((conversation2 == null && (groupEntityType = conversation2.getGroupEntityType()) != null && groupEntityType.intValue() == 12) ? 0 : 8);
                    AppCompatTextView appCompatTextView4 = c42886req.djBIcL;
                    Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
                    appCompatTextView4.setVisibility(8);
                }
            } else {
                AppCompatTextView appCompatTextView5 = c42886req.EZpvd;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView5, "");
                appCompatTextView5.setVisibility(8);
                AppCompatImageView appCompatImageView2 = c42886req.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
                OKConversation conversation22 = ((SearchResultData.ChatAndContact) c40004qFu.OLrzqt()).getConversation();
                appCompatImageView2.setVisibility((conversation22 == null && (groupEntityType = conversation22.getGroupEntityType()) != null && groupEntityType.intValue() == 12) ? 0 : 8);
                AppCompatTextView appCompatTextView42 = c42886req.djBIcL;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView42, "");
                appCompatTextView42.setVisibility(8);
            }
        } else if (searchResultDataOLrzqt instanceof SearchResultData.Message) {
            InterfaceC35180nqU interfaceC35180nqUOLrzqt3 = OLrzqt();
            if (interfaceC35180nqUOLrzqt3 != null) {
                C35893oHp c35893oHp2 = c42886req.copydefault;
                Intrinsics.checkNotNullExpressionValue(c35893oHp2, "");
                interfaceC35180nqUOLrzqt3.AEQbTJ(c35893oHp2, (SearchResultData.Message) c40004qFu.OLrzqt());
            }
            AppCompatTextView appCompatTextView6 = c42886req.EZpvd;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView6, "");
            appCompatTextView6.setVisibility(8);
            AppCompatImageView appCompatImageView3 = c42886req.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "");
            java.lang.Integer groupEntityType2 = ((SearchResultData.Message) c40004qFu.OLrzqt()).getConversation().getGroupEntityType();
            if (groupEntityType2 != null && groupEntityType2.intValue() == 12) {
                i2 = 0;
            }
            appCompatImageView3.setVisibility(i2);
            AppCompatTextView appCompatTextView7 = c42886req.djBIcL;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView7, "");
            appCompatTextView7.setVisibility(0);
            AppCompatTextView appCompatTextView8 = c42886req.djBIcL;
            InterfaceC35180nqU interfaceC35180nqUOLrzqt4 = OLrzqt();
            if (interfaceC35180nqUOLrzqt4 != null) {
                android.content.Context context = c42886req.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                strCopydefault = interfaceC35180nqUOLrzqt4.copydefault(context, (SearchResultData.Message) c40004qFu.OLrzqt());
            }
            appCompatTextView8.setText(strCopydefault);
        }
        ConstraintLayout root = c42886req.getRoot();
        root.setOnClickListener(new Application(root, 1000L, c42886req, c40004qFu, i, this));
    }

    public static final Unit OLrzqt(C39981qEy c39981qEy, C42886req c42886req, C40004qFu c40004qFu, AppCompatTextView appCompatTextView) {
        Intrinsics.checkNotNullParameter(appCompatTextView, "");
        AppCompatTextView appCompatTextView2 = c42886req.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        java.lang.String strKWHzl = c40004qFu.KWHzl();
        c39981qEy.AEQbTJ(appCompatTextView2, strKWHzl != null ? strKWHzl : "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.qEy$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ C42886req EZpvd;
        public final /* synthetic */ C40004qFu KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;
        public final /* synthetic */ C39981qEy djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C42886req c42886req, C40004qFu c40004qFu, int i, C39981qEy c39981qEy) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = c42886req;
            this.KWHzl = c40004qFu;
            this.AEQbTJ = i;
            this.djBIcL = c39981qEy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.Object objM7377constructorimpl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                ConstraintLayout root = this.EZpvd.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(ViewKt.findFragment(root));
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = null;
                }
                androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) objM7377constructorimpl;
                if (fragment != null) {
                    boolean z = fragment instanceof qHM;
                    java.lang.Object obj = fragment;
                    if (!z) {
                        androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
                        while (parentFragment != null && !(parentFragment instanceof qHM)) {
                            parentFragment = parentFragment.getParentFragment();
                        }
                        obj = (qHM) (parentFragment instanceof qHM ? parentFragment : null);
                    }
                    qHM qhm = (qHM) obj;
                    if (qhm != null) {
                        qhm.copydefault(this.KWHzl, this.AEQbTJ, this.djBIcL.AEQbTJ());
                    }
                }
            }
        }
    }
}

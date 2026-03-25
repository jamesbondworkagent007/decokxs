package o;

import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.core.glide.ImageSize;
import com.okinc.im.bean.tag.TagSize;
import com.okinc.okimcore.model.remote.OfficialMark;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.OfficialTagType;
import com.okinc.okimcore.model.remote.TagColorMode;
import com.okinc.p2p.api.OTCService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C33625mzw;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ozA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37716ozA {

    /* JADX INFO: renamed from: o.ozA$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TagSize.values().length];
            try {
                iArr[TagSize.DP_14.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TagSize.DP_18.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TagSize.DP_26.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[TagColorMode.values().length];
            try {
                iArr2[TagColorMode.DARK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[TagColorMode.LIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            KWHzl = iArr2;
        }
    }

    public static final void AEQbTJ(@NotNull C52794wYp c52794wYp) {
        Intrinsics.checkNotNullParameter(c52794wYp, "");
        C55280xgv newProxyInstance = c52794wYp.getNewProxyInstance();
        C55279xgu c55279xguFARcdN = c52794wYp.fARcdN();
        c55279xguFARcdN.AhwBna(C33070mpX.copydefault(C52761wXj.Activity.zblBkD));
        c55279xguFARcdN.valueOf(C33070mpX.copydefault(C52761wXj.Activity.zblBkD));
        c55279xguFARcdN.AYXKKw(C33070mpX.copydefault(C52761wXj.Activity.zblBkD));
        c55279xguFARcdN.djBIcL(c55279xguFARcdN.fARcdN());
        Unit unit = Unit.INSTANCE;
        newProxyInstance.KWHzl(c52794wYp, c55279xguFARcdN);
        c52794wYp.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.igXuih));
    }

    public static final void KWHzl(@NotNull C35893oHp c35893oHp, OfficialTagInfo officialTagInfo, @NotNull TagSize tagSize) {
        Intrinsics.checkNotNullParameter(c35893oHp, "");
        Intrinsics.checkNotNullParameter(tagSize, "");
        android.content.Context context = c35893oHp.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c35893oHp.setTaggedDrawable(KWHzl(context, officialTagInfo, tagSize));
    }

    public static final android.graphics.drawable.Drawable KWHzl(@NotNull android.content.Context context, OfficialTagInfo officialTagInfo, @NotNull TagSize tagSize) {
        int i;
        java.util.List<OfficialMark> supportMarkTypes;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(tagSize, "");
        OfficialMark officialMark = (officialTagInfo == null || (supportMarkTypes = officialTagInfo.getSupportMarkTypes()) == null) ? null : (OfficialMark) CollectionsKt___CollectionsKt.AkhnZx(supportMarkTypes, 0);
        java.util.Set setAhwBna = yEE.AhwBna(OfficialMark.OfficialGroup, OfficialMark.OfficialPerson);
        if (officialMark == null || !setAhwBna.contains(officialMark)) {
            return null;
        }
        int i2 = Activity.EZpvd[tagSize.ordinal()];
        if (i2 == 1) {
            i = C35399nuc.ActionBar.QVAiDq;
        } else if (i2 == 2) {
            i = C35399nuc.ActionBar.QUSxYX;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = C35399nuc.ActionBar.QbewEr;
        }
        return AppCompatResources.getDrawable(context, i);
    }

    public static /* synthetic */ void updateTagViewWithTagInfo$default(android.widget.TextView textView, OfficialTagInfo officialTagInfo, int i, TagColorMode tagColorMode, boolean z, boolean z2, boolean z3, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            tagColorMode = TagColorMode.NORMAL;
        }
        KWHzl(textView, officialTagInfo, i3, tagColorMode, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? false : z3);
    }

    public static final void KWHzl(@NotNull android.widget.TextView textView, OfficialTagInfo officialTagInfo, int i, @NotNull TagColorMode tagColorMode, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(tagColorMode, "");
        C37717ozB.KWHzl.AEQbTJ(textView, officialTagInfo, i, tagColorMode, z, z2, z3);
    }

    public static final void OLrzqt(@NotNull android.widget.TextView textView, android.graphics.drawable.Drawable drawable) {
        Intrinsics.checkNotNullParameter(textView, "");
        C33092mpt.OLrzqt(textView, drawable, 8388613, ImageSize.create(C33570myu.EZpvd(textView.getContext(), 12)));
    }

    public static /* synthetic */ void updateMerchantIconWithTagInfo$default(android.widget.TextView textView, OfficialTagInfo officialTagInfo, TagColorMode tagColorMode, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            tagColorMode = TagColorMode.NORMAL;
        }
        OLrzqt(textView, officialTagInfo, tagColorMode);
    }

    public static final void OLrzqt(@NotNull android.widget.TextView textView, OfficialTagInfo officialTagInfo, @NotNull TagColorMode tagColorMode) {
        java.util.List<OfficialTagType> listAhwBna;
        android.graphics.drawable.Drawable verifiedMerchantIcon;
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(tagColorMode, "");
        ImageSize imageSizeCreate = ImageSize.create(C33570myu.EZpvd(textView.getContext(), 12));
        OTCService oTCService = (OTCService) C43251rlk.OLrzqt(OTCService.class);
        if (officialTagInfo == null || (listAhwBna = officialTagInfo.getSupportTagTypes()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        if (oTCService == null || !(!listAhwBna.isEmpty())) {
            return;
        }
        if (listAhwBna.contains(OfficialTagType.DiamondMerchant)) {
            verifiedMerchantIcon = oTCService.getDiamondMerchantIcon();
        } else {
            verifiedMerchantIcon = listAhwBna.contains(OfficialTagType.CertifiedMerchant) ? oTCService.getVerifiedMerchantIcon() : null;
        }
        int i = Activity.KWHzl[tagColorMode.ordinal()];
        if (i == 1) {
            textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.aUsmxb));
        } else if (i == 2) {
            textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.USBtdM));
        }
        C33092mpt.OLrzqt(textView, verifiedMerchantIcon, 8388613, imageSizeCreate);
    }

    public static final void KWHzl(@NotNull final FragmentActivity fragmentActivity, final boolean z, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function0, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(fragmentActivity);
        viewOnClickListenerC54939xaY.setTitle(C35399nuc.LoaderManager.QOLQEE);
        viewOnClickListenerC54939xaY.copydefault(C35399nuc.LoaderManager.DTwDnp);
        viewOnClickListenerC54939xaY.EZpvd(C35399nuc.LoaderManager.ORxRYg, new View.OnClickListener() { // from class: o.ozx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C37716ozA.EZpvd(fragmentActivity, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C35399nuc.LoaderManager.OqFWZa, new View.OnClickListener() { // from class: o.ozG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C37716ozA.copydefault(viewOnClickListenerC54939xaY, function0, z, fragmentActivity, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(FragmentActivity fragmentActivity, android.view.View view) {
        ((InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class)).AEQbTJ((android.content.Context) fragmentActivity);
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function0 function0, boolean z, FragmentActivity fragmentActivity, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        function0.invoke();
        if (z) {
            fragmentActivity.finish();
        }
    }

    public static final ViewOnClickListenerC54939xaY EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.copydefault(C35399nuc.LoaderManager.HrMTQN);
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C35399nuc.LoaderManager.getNewProxyInstance, (View.OnClickListener) null, 2, (java.lang.Object) null);
        return viewOnClickListenerC54939xaY;
    }

    /* JADX INFO: renamed from: o.ozA$StateListAnimator */
    public static final class StateListAnimator implements C33625mzw.Activity {
        public final /* synthetic */ Function0<Unit> KWHzl;

        @Override // o.C33625mzw.Activity
        public void EZpvd(java.util.List<java.lang.String> list) {
        }

        public StateListAnimator(Function0<Unit> function0) {
            this.KWHzl = function0;
        }

        @Override // o.C33625mzw.Activity
        public void EZpvd() {
            this.KWHzl.invoke();
        }
    }

    public static final void KWHzl(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, int i, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(function0, "");
        abstractActivityC33041mov.getPermissionHelper().copydefault(abstractActivityC33041mov, i, new StateListAnimator(function0));
    }

    public static /* synthetic */ void updateConversationEmptyStatusView$default(android.view.View view, java.lang.CharSequence charSequence, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            l = null;
        }
        OLrzqt(view, charSequence, l);
    }

    public static final void OLrzqt(android.view.View view, @NotNull java.lang.CharSequence charSequence, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (view != null) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(C35399nuc.StateListAnimator.DlABUU);
            if (lottieAnimationView != null) {
                android.content.Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                lottieAnimationView.setAnimationFromUrl(C7827arF.EZpvd("lottie/im/lottie_im_conversation_empty_anim.lottie", context, true));
                if (!lottieAnimationView.isAnimating()) {
                    lottieAnimationView.playAnimation();
                }
            }
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(C35399nuc.StateListAnimator.vqBjd);
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    public static final void EZpvd(@NotNull final android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        view.setOnTouchListener(new View.OnTouchListener() { // from class: o.ozy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                return C37716ozA.copydefault(view, view2, motionEvent);
            }
        });
    }

    public static final boolean copydefault(android.view.View view, android.view.View view2, android.view.MotionEvent motionEvent) {
        C33570myu.AEQbTJ(view.getContext(), view);
        return false;
    }
}

package o;

import android.view.View;
import com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingButtonTileBinder$1;
import com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fdb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18183fdb extends AbstractC14584doH<DefiOnboardingTile.ButtonTile, C16730epT> {
    public final Function1<InterfaceC18127fcY, Unit> AEQbTJ;

    /* JADX INFO: renamed from: o.fdb$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DefiOnboardingTile.ButtonTile.ButtonStyle.values().length];
            try {
                iArr[DefiOnboardingTile.ButtonTile.ButtonStyle.Filled.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[DefiOnboardingTile.ButtonTile.ButtonStyle.Outlined.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[DefiOnboardingTile.ButtonTile.ButtonStyle.Text.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[DefiOnboardingTile.ButtonTile.ButtonWidth.values().length];
            try {
                iArr2[DefiOnboardingTile.ButtonTile.ButtonWidth.MatchParent.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[DefiOnboardingTile.ButtonTile.ButtonWidth.WrapContent.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            copydefault = iArr2;
            int[] iArr3 = new int[DefiOnboardingTile.ButtonTile.ButtonHeight.values().length];
            try {
                iArr3[DefiOnboardingTile.ButtonTile.ButtonHeight.DEFAULT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr3[DefiOnboardingTile.ButtonTile.ButtonHeight.LARGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            OLrzqt = iArr3;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.fcY, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C18183fdb(@NotNull Function1<? super InterfaceC18127fcY, Unit> function1) {
        super(DefiOnboardingButtonTileBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    @Override // o.AbstractC14584doH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OLrzqt(@NotNull C16730epT c16730epT, @NotNull final DefiOnboardingTile.ButtonTile buttonTile) {
        int i;
        int i2;
        java.lang.String strCopydefault;
        Intrinsics.checkNotNullParameter(c16730epT, "");
        Intrinsics.checkNotNullParameter(buttonTile, "");
        int i3 = TaskDescription.EZpvd[buttonTile.gEmmrt().ordinal()];
        if (i3 == 1) {
            i = 257;
        } else if (i3 == 2) {
            i = 260;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = 49;
        }
        int i4 = TaskDescription.copydefault[buttonTile.djBIcL().ordinal()];
        if (i4 == 1) {
            i2 = -1;
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = -2;
        }
        int i5 = TaskDescription.OLrzqt[buttonTile.AEQbTJ().ordinal()];
        if (i5 != 1 && i5 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        java.lang.Integer numAhwBna = buttonTile.AhwBna();
        if (numAhwBna != null) {
            strCopydefault = c16730epT.getRoot().getContext().getString(numAhwBna.intValue());
            if (strCopydefault == null) {
                strCopydefault = buttonTile.copydefault();
            }
        }
        c16730epT.getRoot().setGravity(buttonTile.OLrzqt());
        C52794wYp c52794wYp = c16730epT.copydefault;
        c52794wYp.setText(strCopydefault);
        c52794wYp.setOKDSType(i);
        c52794wYp.getLayoutParams().width = i2;
        c52794wYp.setOKDSSize(52);
        c52794wYp.setButtonGravity(buttonTile.KWHzl());
        c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.fda
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C18183fdb.OLrzqt(this.copydefault, buttonTile, view);
            }
        });
    }

    public static final void OLrzqt(C18183fdb c18183fdb, DefiOnboardingTile.ButtonTile buttonTile, android.view.View view) {
        c18183fdb.AEQbTJ.invoke(buttonTile.EZpvd());
    }
}

package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wJl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C52385wJl extends AbstractC33000moG {
    public final android.content.Context KWHzl;
    public final java.lang.String copydefault;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52385wJl(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull AbstractC32998moE abstractC32998moE, @NotNull java.lang.String str) {
        super(fragmentManager, abstractC32998moE);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(abstractC32998moE, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = context;
        this.copydefault = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (r2v0 androidx.fragment.app.FragmentManager)
  (r3v0 o.moE)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(android.content.Context, androidx.fragment.app.FragmentManager, o.moE, java.lang.String):void (m)] (LINE:12) call: o.wJl.<init>(android.content.Context, androidx.fragment.app.FragmentManager, o.moE, java.lang.String):void type: THIS */
    public /* synthetic */ C52385wJl(android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, AbstractC32998moE abstractC32998moE, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, fragmentManager, abstractC32998moE, (i & 8) != 0 ? "" : str);
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public androidx.fragment.app.Fragment getItem(int i) {
        return C52376wJc.Companion.KWHzl(i != 0);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public java.lang.CharSequence getPageTitle(int i) {
        if (i == 0) {
            return C33070mpX.AYXKKw(C55688xof.Application.ActivityResultRegistryKtrememberLauncherForActivityResult1invokeinlinedonDispose1);
        }
        return C33070mpX.AYXKKw(C55688xof.Application.findOwner);
    }
}

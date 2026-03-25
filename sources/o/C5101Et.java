package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Et, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5101Et {
    public static final ActionBar AEQbTJ = new ActionBar(null);
    public int EZpvd;
    public final AbstractC5105Ex KWHzl;
    public final java.util.Set<InterfaceC5096Eo> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Set<InterfaceC5096Eo> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.EZpvd = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC5105Ex KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Set<? extends o.Eo> */
    /* JADX WARN: Multi-variable type inference failed */
    public C5101Et(@NotNull AbstractC5105Ex abstractC5105Ex, int i, @NotNull java.util.Set<? extends InterfaceC5096Eo> set) {
        Intrinsics.checkNotNullParameter(abstractC5105Ex, "");
        Intrinsics.checkNotNullParameter(set, "");
        this.KWHzl = abstractC5105Ex;
        this.EZpvd = i;
        this.copydefault = set;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5101Et(@NotNull AbstractC5105Ex abstractC5105Ex, @NotNull InterfaceC5096Eo... interfaceC5096EoArr) {
        this(abstractC5105Ex, 0, yDV.QOLQEE(interfaceC5096EoArr));
        Intrinsics.checkNotNullParameter(abstractC5105Ex, "");
        Intrinsics.checkNotNullParameter(interfaceC5096EoArr, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5101Et(@NotNull AbstractC5105Ex abstractC5105Ex, @NotNull java.util.Set<? extends InterfaceC5096Eo> set) {
        this(abstractC5105Ex, 0, set);
        Intrinsics.checkNotNullParameter(abstractC5105Ex, "");
        Intrinsics.checkNotNullParameter(set, "");
    }

    /* JADX INFO: renamed from: o.Et$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Et.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        return "SdkFieldDescriptor." + this.KWHzl + "(traits=" + CollectionsKt___CollectionsKt.joinToString$default(this.copydefault, ",", null, null, 0, null, null, 62, null) + ')';
    }
}

package o;

import aws.smithy.kotlin.runtime.http.HttpMethod;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.DL;
import o.InterfaceC58536zG;
import o.InterfaceC58725zN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Cf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5035Cf implements InterfaceC5037Ch {
    public final C5036Cg AEQbTJ;
    public final HttpMethod AhwBna;
    public final zP EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final boolean OLrzqt;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C5035Cf copy$default(C5035Cf c5035Cf, C5036Cg c5036Cg, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c5036Cg = c5035Cf.AEQbTJ;
        }
        if ((i & 2) != 0) {
            z = c5035Cf.OLrzqt;
        }
        return c5035Cf.copydefault(c5036Cg, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5036Cg AhwBna() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5037Ch
    public zP KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5037Ch
    public HttpMethod OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5035Cf copydefault(@NotNull C5036Cg c5036Cg, boolean z) {
        Intrinsics.checkNotNullParameter(c5036Cg, "");
        return new C5035Cf(c5036Cg, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5035Cf)) {
            return false;
        }
        C5035Cf c5035Cf = (C5035Cf) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c5035Cf.AEQbTJ) && this.OLrzqt == c5035Cf.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "HttpRequestBuilderView(builder=" + this.AEQbTJ + ", allowToBuilder=" + this.OLrzqt + ')';
    }

    public C5035Cf(@NotNull C5036Cg c5036Cg, boolean z) {
        Intrinsics.checkNotNullParameter(c5036Cg, "");
        this.AEQbTJ = c5036Cg;
        this.OLrzqt = z;
        this.AhwBna = c5036Cg.EZpvd();
        this.djBIcL = C56392yDr.copydefault(new Function0<DL>() { // from class: aws.smithy.kotlin.runtime.http.request.HttpRequestBuilderView$url$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final DL invoke() {
                return this.this$0.AhwBna().djBIcL().KWHzl();
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0<InterfaceC58725zN>() { // from class: aws.smithy.kotlin.runtime.http.request.HttpRequestBuilderView$headers$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final InterfaceC58725zN invoke() {
                return this.this$0.AhwBna().AEQbTJ().AYXKKw();
            }
        });
        this.EZpvd = c5036Cg.KWHzl();
        this.gEmmrt = C56392yDr.copydefault(new Function0<InterfaceC58536zG>() { // from class: aws.smithy.kotlin.runtime.http.request.HttpRequestBuilderView$trailingHeaders$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final InterfaceC58536zG invoke() {
                return this.this$0.AhwBna().AhwBna().djBIcL();
            }
        });
    }

    @Override // o.InterfaceC5037Ch
    public DL AEQbTJ() {
        return (DL) this.djBIcL.getValue();
    }

    @Override // o.InterfaceC5037Ch
    public InterfaceC58725zN EZpvd() {
        return (InterfaceC58725zN) this.KWHzl.getValue();
    }

    @Override // o.InterfaceC5037Ch
    public InterfaceC58536zG copydefault() {
        return (InterfaceC58536zG) this.gEmmrt.getValue();
    }
}

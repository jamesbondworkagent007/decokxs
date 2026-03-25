package o;

import java.util.zip.GZIPOutputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC59439zh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C59174zc implements InterfaceC59068za {
    public final java.lang.String OLrzqt = "gzip";
    public final java.lang.String KWHzl = "gzip";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59068za
    public java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59068za
    public java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX INFO: renamed from: o.zc$StateListAnimator */
    public static final class StateListAnimator extends AbstractC59439zh.Application {
        public final java.lang.Long AEQbTJ;
        public final /* synthetic */ AbstractC59439zh KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC59439zh
        public java.lang.Long OLrzqt() {
            return this.AEQbTJ;
        }

        public StateListAnimator(AbstractC59439zh abstractC59439zh) {
            this.KWHzl = abstractC59439zh;
        }

        @Override // o.AbstractC59439zh.Application
        public byte[] EZpvd() throws java.io.IOException {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(((AbstractC59439zh.Application) this.KWHzl).EZpvd());
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            Intrinsics.copydefault(byteArray);
            return byteArray;
        }
    }

    @Override // o.InterfaceC59068za
    public AbstractC59439zh copydefault(@NotNull AbstractC59439zh abstractC59439zh) {
        Intrinsics.checkNotNullParameter(abstractC59439zh, "");
        if (abstractC59439zh instanceof AbstractC59439zh.Application) {
            return new StateListAnimator(abstractC59439zh);
        }
        if (abstractC59439zh instanceof AbstractC59439zh.Activity) {
            return new Application(abstractC59439zh);
        }
        if (abstractC59439zh instanceof AbstractC59439zh.StateListAnimator) {
            return new ActionBar(abstractC59439zh);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: o.zc$Application */
    public static final class Application extends AbstractC59439zh.Activity {
        public final java.lang.Long EZpvd;
        public final boolean OLrzqt;
        public final /* synthetic */ AbstractC59439zh copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC59439zh
        public java.lang.Long OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC59439zh
        public boolean copydefault() {
            return this.OLrzqt;
        }

        public Application(AbstractC59439zh abstractC59439zh) {
            this.copydefault = abstractC59439zh;
            this.OLrzqt = abstractC59439zh.copydefault();
        }

        @Override // o.AbstractC59439zh.Activity
        public CS EZpvd() {
            return new CD(((AbstractC59439zh.Activity) this.copydefault).EZpvd());
        }
    }

    /* JADX INFO: renamed from: o.zc$ActionBar */
    public static final class ActionBar extends AbstractC59439zh.StateListAnimator {
        public final java.lang.Long AEQbTJ;
        public final /* synthetic */ AbstractC59439zh EZpvd;
        public final boolean KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC59439zh
        public java.lang.Long OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC59439zh
        public boolean copydefault() {
            return this.KWHzl;
        }

        public ActionBar(AbstractC59439zh abstractC59439zh) {
            this.EZpvd = abstractC59439zh;
            this.KWHzl = abstractC59439zh.copydefault();
        }

        @Override // o.AbstractC59439zh.StateListAnimator
        public InterfaceC5060De AEQbTJ() {
            return new CF(((AbstractC59439zh.StateListAnimator) this.EZpvd).AEQbTJ());
        }
    }
}

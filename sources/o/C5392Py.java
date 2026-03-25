package o;

import android.content.res.Resources;
import com.fasterxml.jackson.core.JsonPointer;
import java.util.Objects;
import o.InterfaceC5386Ps;

/* JADX INFO: renamed from: o.Py, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5392Py<Data> implements InterfaceC5386Ps<java.lang.Integer, Data> {
    public final android.content.res.Resources EZpvd;
    public final InterfaceC5386Ps<android.net.Uri, Data> KWHzl;

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Z */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@androidx.annotation.NonNull java.lang.Integer num) {
        return true;
    }

    public C5392Py(android.content.res.Resources resources, InterfaceC5386Ps<android.net.Uri, Data> interfaceC5386Ps) {
        this.EZpvd = resources;
        this.KWHzl = interfaceC5386Ps;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;IILo/NM;)Lo/Ps$Application; */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public InterfaceC5386Ps.Application<Data> AEQbTJ(@androidx.annotation.NonNull java.lang.Integer num, int i, int i2, @androidx.annotation.NonNull NM nm) {
        android.net.Uri uriCopydefault = copydefault(num);
        if (uriCopydefault == null) {
            return null;
        }
        return this.KWHzl.AEQbTJ(uriCopydefault, i, i2, nm);
    }

    public final android.net.Uri copydefault(java.lang.Integer num) {
        try {
            return android.net.Uri.parse("android.resource://" + this.EZpvd.getResourcePackageName(num.intValue()) + JsonPointer.SEPARATOR + this.EZpvd.getResourceTypeName(num.intValue()) + JsonPointer.SEPARATOR + this.EZpvd.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException unused) {
            if (!android.util.Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Objects.toString(num);
            return null;
        }
    }

    /* JADX INFO: renamed from: o.Py$TaskDescription */
    public static class TaskDescription implements InterfaceC5390Pw<java.lang.Integer, java.io.InputStream> {
        public final android.content.res.Resources KWHzl;

        @Override // o.InterfaceC5390Pw
        public void AEQbTJ() {
        }

        public TaskDescription(android.content.res.Resources resources) {
            this.KWHzl = resources;
        }

        @Override // o.InterfaceC5390Pw
        public InterfaceC5386Ps<java.lang.Integer, java.io.InputStream> AEQbTJ(PA pa) {
            return new C5392Py(this.KWHzl, pa.OLrzqt(android.net.Uri.class, java.io.InputStream.class));
        }
    }

    /* JADX INFO: renamed from: o.Py$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC5390Pw<java.lang.Integer, android.content.res.AssetFileDescriptor> {
        public final android.content.res.Resources EZpvd;

        @Override // o.InterfaceC5390Pw
        public void AEQbTJ() {
        }

        public StateListAnimator(android.content.res.Resources resources) {
            this.EZpvd = resources;
        }

        @Override // o.InterfaceC5390Pw
        public InterfaceC5386Ps<java.lang.Integer, android.content.res.AssetFileDescriptor> AEQbTJ(PA pa) {
            return new C5392Py(this.EZpvd, pa.OLrzqt(android.net.Uri.class, android.content.res.AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: o.Py$ActionBar */
    public static class ActionBar implements InterfaceC5390Pw<java.lang.Integer, android.net.Uri> {
        public final android.content.res.Resources AEQbTJ;

        @Override // o.InterfaceC5390Pw
        public void AEQbTJ() {
        }

        public ActionBar(android.content.res.Resources resources) {
            this.AEQbTJ = resources;
        }

        @Override // o.InterfaceC5390Pw
        public InterfaceC5386Ps<java.lang.Integer, android.net.Uri> AEQbTJ(PA pa) {
            return new C5392Py(this.AEQbTJ, PH.AEQbTJ());
        }
    }
}

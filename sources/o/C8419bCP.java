package o;

import com.okinc.business.defi.biz.database.wallet.entity.CustomFeeEntity;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bCP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8419bCP {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final C11479cPu OLrzqt;

    public C8419bCP(@NotNull C11479cPu c11479cPu) {
        Intrinsics.checkNotNullParameter(c11479cPu, "");
        this.OLrzqt = c11479cPu;
    }

    /* JADX INFO: renamed from: o.bCP$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bCP.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ C8419bCP getInstance$default(TaskDescription taskDescription, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return taskDescription.copydefault(context);
        }

        public final C8419bCP copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).AYXKKw();
        }
    }

    public final AbstractC58260yxt<java.util.List<CustomFeeEntity>> OLrzqt(java.lang.Long l) {
        return this.OLrzqt.copydefault(l);
    }

    public final AbstractC58260yxt<Unit> copydefault(@NotNull CustomFeeEntity customFeeEntity) {
        Intrinsics.checkNotNullParameter(customFeeEntity, "");
        return this.OLrzqt.copydefault(customFeeEntity);
    }

    public final AbstractC58260yxt<Unit> KWHzl(java.lang.Long l) {
        return this.OLrzqt.KWHzl(l);
    }
}

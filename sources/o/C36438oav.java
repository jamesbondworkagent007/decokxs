package o;

import com.okinc.im.bean.IMCacheStrategy;
import com.okinc.im.bean.IMRelationInfo;
import com.okinc.im.bean.RelationModel;
import com.okinc.okimcore.model.im.CacheStrategy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oav, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36438oav extends AbstractC43215rlA implements InterfaceC35177nqR {

    /* JADX INFO: renamed from: o.oav$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[IMCacheStrategy.values().length];
            try {
                iArr[IMCacheStrategy.CacheOnly.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[IMCacheStrategy.CacheFirst.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[IMCacheStrategy.ForceRemote.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    @Override // o.InterfaceC35177nqR
    public java.lang.Object KWHzl(@NotNull java.util.List<RelationModel> list, @NotNull IMCacheStrategy iMCacheStrategy, @NotNull Continuation<? super java.util.List<IMRelationInfo>> continuation) {
        CacheStrategy cacheStrategy;
        C35860oGj c35860oGj = new C35860oGj(sDZ.AEQbTJ.AhwBna().AEQbTJ());
        int i = Application.EZpvd[iMCacheStrategy.ordinal()];
        if (i == 1) {
            cacheStrategy = CacheStrategy.CacheOnly;
        } else if (i == 2) {
            cacheStrategy = CacheStrategy.CacheFirst;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            cacheStrategy = CacheStrategy.ForceRemote;
        }
        return c35860oGj.KWHzl(list, cacheStrategy, continuation);
    }

    @Override // o.InterfaceC35177nqR
    public void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        context.startActivity(ActivityC33638nAh.Companion.OLrzqt(context, str, str2));
    }
}

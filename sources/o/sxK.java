package o;

import com.okinc.biz.model.RatingDisplayStatus;
import com.okinc.okex.rating.bean.GetSupportRatingBean;
import com.okinc.okex.rating.bean.PreSubmitRatingBean;
import com.okinc.okex.rating.net.RatingResult;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sxK {
    public static final sxK copydefault = new sxK();

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[GetSupportRatingBean.AppLayoutType.values().length];
            try {
                iArr[GetSupportRatingBean.AppLayoutType.FullScreen.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[GetSupportRatingBean.AppLayoutType.HalfScreen.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[GetSupportRatingBean.AppLayoutType.HalfScreenRedirectToFullScreen.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[RatingDisplayStatus.values().length];
            try {
                iArr2[RatingDisplayStatus.RatingSubmitted.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[RatingDisplayStatus.NoNeedToDisplay.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[RatingDisplayStatus.RatingExpired.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[RatingDisplayStatus.DisplayRating.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            copydefault = iArr2;
        }
    }

    private sxK() {
    }

    public final GetSupportRatingBean.Layout AEQbTJ(boolean z, GetSupportRatingBean getSupportRatingBean) {
        if (z) {
            if (getSupportRatingBean != null) {
                return getSupportRatingBean.getHalfLayout();
            }
        } else if (getSupportRatingBean != null) {
            return getSupportRatingBean.getFullLayout();
        }
        return null;
    }

    public final boolean OLrzqt(RatingResult ratingResult) {
        return !(ratingResult instanceof RatingResult.BottomSheet) ? !((ratingResult instanceof RatingResult.FullPage) && ((RatingResult.FullPage) ratingResult).EZpvd().getStatus() == RatingDisplayStatus.DisplayRating) : ((RatingResult.BottomSheet) ratingResult).KWHzl().getStatus() != RatingDisplayStatus.DisplayRating;
    }

    public static /* synthetic */ RatingResult toRatingResult$default(sxK sxk, GetSupportRatingBean getSupportRatingBean, java.lang.String str, JsonObject jsonObject, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            jsonObject = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return sxk.EZpvd(getSupportRatingBean, str, jsonObject, str2);
    }

    public final RatingResult EZpvd(@NotNull GetSupportRatingBean getSupportRatingBean, java.lang.String str, JsonObject jsonObject, java.lang.String str2) {
        RatingResult fullPage;
        Intrinsics.checkNotNullParameter(getSupportRatingBean, "");
        JsonObject jsonObjectCopydefault = copydefault(jsonObject);
        RatingDisplayStatus status = getSupportRatingBean.getStatus();
        int i = status == null ? -1 : StateListAnimator.copydefault[status.ordinal()];
        if (i == 1) {
            return RatingResult.SubmittedAlready.copydefault;
        }
        if (i == 2) {
            return RatingResult.NoRating.EZpvd;
        }
        if (i == 3) {
            return RatingResult.Expired.OLrzqt;
        }
        if (i == 4) {
            GetSupportRatingBean.AppLayoutType appLayoutType = getSupportRatingBean.getAppLayoutType();
            int i2 = appLayoutType != null ? StateListAnimator.EZpvd[appLayoutType.ordinal()] : -1;
            if (i2 == 1) {
                fullPage = new RatingResult.FullPage(getSupportRatingBean, str, jsonObjectCopydefault, str2);
            } else if (i2 == 2 || i2 == 3) {
                fullPage = new RatingResult.BottomSheet(getSupportRatingBean, str, jsonObjectCopydefault, str2);
            }
            return fullPage;
        }
        return null;
    }

    public final void KWHzl(@NotNull android.content.Context context, @NotNull RatingResult ratingResult, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(ratingResult, "");
        android.content.Intent intent$default = RatingResult.toIntent$default(ratingResult, context, null, new PreSubmitRatingBean(java.lang.Integer.valueOf(z ? 5 : 1)), 2, null);
        if (intent$default != null) {
            context.startActivity(intent$default);
        }
    }

    public final JsonObject copydefault(JsonObject jsonObject) {
        InterfaceC47278tmy interfaceC47278tmyFmB = ((InterfaceC47230tmC) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC47230tmC.class)).fmB();
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        C45359soM c45359soM = C45359soM.copydefault;
        JsonElementBuildersKt.put(jsonObjectBuilder, "create_time", pTA.formatSimpleDateTime$default(new Date(c45359soM.copydefault()), null, 1, null));
        JsonElementBuildersKt.put(jsonObjectBuilder, "isLoggedIn", java.lang.Boolean.valueOf(interfaceC47278tmyFmB.values()));
        JsonElementBuildersKt.put(jsonObjectBuilder, "usedHelpCenter", java.lang.Boolean.valueOf(c45359soM.AEQbTJ()));
        if (jsonObject != null) {
            for (Map.Entry<java.lang.String, JsonElement> entry : jsonObject.entrySet()) {
                jsonObjectBuilder.put(entry.getKey(), entry.getValue());
            }
        }
        return jsonObjectBuilder.build();
    }
}

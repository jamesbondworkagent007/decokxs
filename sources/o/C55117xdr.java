package o;

import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.contract.ActivityResultContracts;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55123xdx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xdr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C55117xdr extends ActivityResultContracts.PickMultipleVisualMedia {
    public static final ActionBar Companion = new ActionBar(null);
    public final int AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C55117xdr() {
        this(0, 1, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0006: INVOKE (wrap:o.xdr$ActionBar:0x0004: SGET  A[WRAPPED] o.xdr.Companion o.xdr$ActionBar) VIRTUAL call: o.xdr.ActionBar.KWHzl():int A[MD:():int (m), WRAPPED] (LINE:146)) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:145) call: o.xdr.<init>(int):void type: THIS */
    public /* synthetic */ C55117xdr(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Companion.KWHzl() : i);
    }

    public C55117xdr(int i) {
        super(i);
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia, androidx.activity.result.contract.ActivityResultContract
    public android.content.Intent createIntent(@NotNull android.content.Context context, @NotNull PickVisualMediaRequest pickVisualMediaRequest) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(pickVisualMediaRequest, "");
        C55123xdx.ActionBar actionBar = C55123xdx.Companion;
        if (actionBar.copydefault()) {
            return super.createIntent(context, pickVisualMediaRequest);
        }
        if (actionBar.EZpvd(context)) {
            return super.createIntent(context, pickVisualMediaRequest);
        }
        if (actionBar.OLrzqt(context)) {
            return super.createIntent(context, pickVisualMediaRequest);
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.OPEN_DOCUMENT");
        intent.setType(actionBar.OLrzqt(pickVisualMediaRequest.getMediaType()));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        if (intent.getType() != null) {
            return intent;
        }
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.MIME_TYPES", new java.lang.String[]{"image/*", "video/*"});
        return intent;
    }

    /* JADX INFO: renamed from: o.xdr$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xdr.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final int KWHzl() {
            if (C55123xdx.Companion.copydefault()) {
                return android.provider.MediaStore.getPickImagesMaxLimit();
            }
            return Integer.MAX_VALUE;
        }
    }
}

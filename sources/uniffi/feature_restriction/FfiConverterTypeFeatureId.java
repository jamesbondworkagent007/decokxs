package uniffi.feature_restriction;

import com.just.agentweb.DefaultChromeClient;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AJP;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.feature_restriction.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeFeatureId implements FfiConverterRustBuffer<AJP> {
    public static final int $stable = 0;
    public static final FfiConverterTypeFeatureId INSTANCE = new FfiConverterTypeFeatureId();

    private FfiConverterTypeFeatureId() {
    }

    @Override // uniffi.feature_restriction.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AJP lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AJP) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AJP liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AJP) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AJP ajp) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, ajp);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AJP ajp) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, ajp);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AJP read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        switch (byteBuffer.getInt()) {
            case 1:
                return AJP.SizeF.INSTANCE;
            case 2:
                return AJP.BaseBundle.INSTANCE;
            case 3:
                return AJP.Theme.INSTANCE;
            case 4:
                return AJP.NoCopySpan.INSTANCE;
            case 5:
                return AJP.PersistableBundle.INSTANCE;
            case 6:
                return AJP.TaskStackBuilder.INSTANCE;
            case 7:
                return AJP.DragEvent.INSTANCE;
            case 8:
                return AJP.KeyListener.INSTANCE;
            case 9:
                return AJP.Cursor.INSTANCE;
            case 10:
                return AJP.ApplicationInfo.INSTANCE;
            case 11:
                return AJP.GetChars.INSTANCE;
            case 12:
                return AJP.Params.INSTANCE;
            case 13:
                return AJP.ComponentName.INSTANCE;
            case 14:
                return AJP.Display.INSTANCE;
            case 15:
                return AJP.ComponentCallbacks.INSTANCE;
            case 16:
                return AJP.DatabaseErrorHandler.INSTANCE;
            case 17:
                return AJP.UpdateAppearance.INSTANCE;
            case 18:
                return AJP.ContextThemeWrapper.INSTANCE;
            case 19:
                return AJP.Looper.INSTANCE;
            case 20:
                return AJP.LocaleList.INSTANCE;
            case 21:
                return AJP.Uri.INSTANCE;
            case 22:
                return AJP.Rect.INSTANCE;
            case 23:
                return AJP.IBinder.INSTANCE;
            case 24:
                return AJP.Callback.INSTANCE;
            case 25:
                return AJP.Typeface.INSTANCE;
            case 26:
                return AJP.Handler.INSTANCE;
            case 27:
                return AJP.TransitionManager.INSTANCE;
            case 28:
                return AJP.ContentResolver.INSTANCE;
            case 29:
                return AJP.Context.INSTANCE;
            case 30:
                return AJP.LayoutInflater.INSTANCE;
            case 31:
                return AJP.DragAndDropPermissions.INSTANCE;
            case 32:
                return AJP.Factory2.INSTANCE;
            case 33:
                return AJP.MenuInflater.INSTANCE;
            case 34:
                return AJP.DispatcherState.INSTANCE;
            case 35:
                return AJP.MovementMethod.INSTANCE;
            case 36:
                return AJP.TransformationMethod.INSTANCE;
            case 37:
                return AJP.URLSpan.INSTANCE;
            case 38:
                return AJP.ActionBar.INSTANCE;
            case 39:
                return AJP.TaskDescription.INSTANCE;
            case 40:
                return AJP.Size.INSTANCE;
            case 41:
                return AJP.CharacterStyle.INSTANCE;
            case 42:
                return AJP.Mode.INSTANCE;
            case 43:
                return AJP.ContextMenuInfo.INSTANCE;
            case 44:
                return AJP.SQLiteClosable.INSTANCE;
            case 45:
                return AJP.Activity.INSTANCE;
            case 46:
                return AJP.Drawable.INSTANCE;
            case 47:
                return AJP.PointerIcon.INSTANCE;
            case 48:
                return AJP.Editable.INSTANCE;
            case 49:
                return AJP.MenuItem.INSTANCE;
            case 50:
                return AJP.Canvas.INSTANCE;
            case 51:
                return AJP.SQLiteDatabase.INSTANCE;
            case 52:
                return AJP.Bitmap.INSTANCE;
            case 53:
                return AJP.TypedArray.INSTANCE;
            case 54:
                return AJP.Parcel.INSTANCE;
            case 55:
                return AJP.Scene.INSTANCE;
            case 56:
                return AJP.TruncateAt.INSTANCE;
            case 57:
                return AJP.MotionEvent.INSTANCE;
            case 58:
                return AJP.TouchDelegate.INSTANCE;
            case 59:
                return AJP.FragmentManager.INSTANCE;
            case 60:
                return AJP.PictureInPictureParams.INSTANCE;
            case 61:
                return AJP.Spanned.INSTANCE;
            case 62:
                return AJP.Intent.INSTANCE;
            case 63:
                return AJP.ContextWrapper.INSTANCE;
            case 64:
                return AJP.ClipData.INSTANCE;
            case 65:
                return AJP.CursorFactory.INSTANCE;
            case 66:
                return AJP.KeyEvent.INSTANCE;
            case 67:
                return AJP.AssetManager.INSTANCE;
            case 68:
                return AJP.Property.INSTANCE;
            case 69:
                return AJP.StateListAnimator.INSTANCE;
            case 70:
                return AJP.BroadcastReceiver.INSTANCE;
            case 71:
                return AJP.Point.INSTANCE;
            case 72:
                return AJP.ContextMenu.INSTANCE;
            case 73:
                return AJP.AttributeSet.INSTANCE;
            case 74:
                return AJP.ComponentCallbacks2.INSTANCE;
            case 75:
                return AJP.ClickableSpan.INSTANCE;
            case 76:
                return AJP.VoiceInteractor.INSTANCE;
            case 77:
                return AJP.IntentSender.INSTANCE;
            case 78:
                return AJP.SparseArray.INSTANCE;
            case 79:
                return AJP.AssistContent.INSTANCE;
            case 80:
                return AJP.IntentFilter.INSTANCE;
            case 81:
                return AJP.Spannable.INSTANCE;
            case 82:
                return AJP.PendingIntent.INSTANCE;
            case 83:
                return AJP.Configuration.INSTANCE;
            case 84:
                return AJP.ColorStateList.INSTANCE;
            case 85:
                return AJP.PackageManager.INSTANCE;
            case 86:
                return AJP.Resources.INSTANCE;
            case 87:
                return AJP.ParcelableSpan.INSTANCE;
            case 88:
                return AJP.Environment.INSTANCE;
            case 89:
                return AJP.Dialog.INSTANCE;
            case 90:
                return AJP.Parcelable.INSTANCE;
            case 91:
                return AJP.Menu.INSTANCE;
            case 92:
                return AJP.Creator.INSTANCE;
            case 93:
                return AJP.Application.INSTANCE;
            case 94:
                return AJP.Paint.INSTANCE;
            case 95:
                return AJP.Bundle.INSTANCE;
            case DefaultChromeClient.FROM_CODE_INTENTION_LOCATION /* 96 */:
                return AJP.SharedElementCallback.INSTANCE;
            case 97:
                return AJP.Gravity.INSTANCE;
            case 98:
                return AJP.Matrix.INSTANCE;
            case 99:
                return AJP.InputEvent.INSTANCE;
            case 100:
                return AJP.DialogInterface.INSTANCE;
            case 101:
                return AJP.Factory.INSTANCE;
            case 102:
                return AJP.Layout.INSTANCE;
            case 103:
                return AJP.LoaderManager.INSTANCE;
            case 104:
                return AJP.InputFilter.INSTANCE;
            case 105:
                return AJP.Fragment.INSTANCE;
            case 106:
                return AJP.PackageItemInfo.INSTANCE;
            case 107:
                return AJP.InputType.INSTANCE;
            case 108:
                return AJP.SharedPreferences.INSTANCE;
            case 109:
                return AJP.ActionMode.INSTANCE;
            case WalletImportError.ERROR_CODE_AA_CREATE_KEY /* 110 */:
                return AJP.ServiceConnection.INSTANCE;
            case WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY /* 111 */:
                return AJP.SearchEvent.INSTANCE;
            case WalletImportError.ERROR_CODE_AA_EXIST /* 112 */:
                return AJP.TextPaint.INSTANCE;
            case WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST /* 113 */:
                return AJP.UserHandle.INSTANCE;
            case 114:
                return AJP.TextWatcher.INSTANCE;
            case 115:
                return new AJP.MediaController(FfiConverterString.INSTANCE.read(byteBuffer));
            default:
                throw new RuntimeException("invalid enum value, something is very wrong!!");
        }
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AJP ajp) {
        Intrinsics.checkNotNullParameter(ajp, "");
        if ((ajp instanceof AJP.SizeF) || (ajp instanceof AJP.BaseBundle) || (ajp instanceof AJP.Theme) || (ajp instanceof AJP.NoCopySpan) || (ajp instanceof AJP.PersistableBundle) || (ajp instanceof AJP.TaskStackBuilder) || (ajp instanceof AJP.DragEvent) || (ajp instanceof AJP.KeyListener) || (ajp instanceof AJP.Cursor) || (ajp instanceof AJP.ApplicationInfo) || (ajp instanceof AJP.GetChars) || (ajp instanceof AJP.Params) || (ajp instanceof AJP.ComponentName) || (ajp instanceof AJP.Display) || (ajp instanceof AJP.ComponentCallbacks) || (ajp instanceof AJP.DatabaseErrorHandler) || (ajp instanceof AJP.UpdateAppearance) || (ajp instanceof AJP.ContextThemeWrapper) || (ajp instanceof AJP.Looper) || (ajp instanceof AJP.LocaleList) || (ajp instanceof AJP.Uri) || (ajp instanceof AJP.Rect) || (ajp instanceof AJP.IBinder) || (ajp instanceof AJP.Callback) || (ajp instanceof AJP.Typeface) || (ajp instanceof AJP.Handler) || (ajp instanceof AJP.TransitionManager) || (ajp instanceof AJP.ContentResolver) || (ajp instanceof AJP.Context) || (ajp instanceof AJP.LayoutInflater) || (ajp instanceof AJP.DragAndDropPermissions) || (ajp instanceof AJP.Factory2) || (ajp instanceof AJP.MenuInflater) || (ajp instanceof AJP.DispatcherState) || (ajp instanceof AJP.MovementMethod) || (ajp instanceof AJP.TransformationMethod) || (ajp instanceof AJP.URLSpan) || (ajp instanceof AJP.ActionBar) || (ajp instanceof AJP.TaskDescription) || (ajp instanceof AJP.Size) || (ajp instanceof AJP.CharacterStyle) || (ajp instanceof AJP.Mode) || (ajp instanceof AJP.ContextMenuInfo) || (ajp instanceof AJP.SQLiteClosable) || (ajp instanceof AJP.Activity) || (ajp instanceof AJP.Drawable) || (ajp instanceof AJP.PointerIcon) || (ajp instanceof AJP.Editable) || (ajp instanceof AJP.MenuItem) || (ajp instanceof AJP.Canvas) || (ajp instanceof AJP.SQLiteDatabase) || (ajp instanceof AJP.Bitmap) || (ajp instanceof AJP.TypedArray) || (ajp instanceof AJP.Parcel) || (ajp instanceof AJP.Scene) || (ajp instanceof AJP.TruncateAt) || (ajp instanceof AJP.MotionEvent) || (ajp instanceof AJP.TouchDelegate) || (ajp instanceof AJP.FragmentManager) || (ajp instanceof AJP.PictureInPictureParams) || (ajp instanceof AJP.Spanned) || (ajp instanceof AJP.Intent) || (ajp instanceof AJP.ContextWrapper) || (ajp instanceof AJP.ClipData) || (ajp instanceof AJP.CursorFactory) || (ajp instanceof AJP.KeyEvent) || (ajp instanceof AJP.AssetManager) || (ajp instanceof AJP.Property) || (ajp instanceof AJP.StateListAnimator) || (ajp instanceof AJP.BroadcastReceiver) || (ajp instanceof AJP.Point) || (ajp instanceof AJP.ContextMenu) || (ajp instanceof AJP.AttributeSet) || (ajp instanceof AJP.ComponentCallbacks2) || (ajp instanceof AJP.ClickableSpan) || (ajp instanceof AJP.VoiceInteractor) || (ajp instanceof AJP.IntentSender) || (ajp instanceof AJP.SparseArray) || (ajp instanceof AJP.AssistContent) || (ajp instanceof AJP.IntentFilter) || (ajp instanceof AJP.Spannable) || (ajp instanceof AJP.PendingIntent) || (ajp instanceof AJP.Configuration) || (ajp instanceof AJP.ColorStateList) || (ajp instanceof AJP.PackageManager) || (ajp instanceof AJP.Resources) || (ajp instanceof AJP.ParcelableSpan) || (ajp instanceof AJP.Environment) || (ajp instanceof AJP.Dialog) || (ajp instanceof AJP.Parcelable) || (ajp instanceof AJP.Menu) || (ajp instanceof AJP.Creator) || (ajp instanceof AJP.Application) || (ajp instanceof AJP.Paint) || (ajp instanceof AJP.Bundle) || (ajp instanceof AJP.SharedElementCallback) || (ajp instanceof AJP.Gravity) || (ajp instanceof AJP.Matrix) || (ajp instanceof AJP.InputEvent) || (ajp instanceof AJP.DialogInterface) || (ajp instanceof AJP.Factory) || (ajp instanceof AJP.Layout) || (ajp instanceof AJP.LoaderManager) || (ajp instanceof AJP.InputFilter) || (ajp instanceof AJP.Fragment) || (ajp instanceof AJP.PackageItemInfo) || (ajp instanceof AJP.InputType) || (ajp instanceof AJP.SharedPreferences) || (ajp instanceof AJP.ActionMode) || (ajp instanceof AJP.ServiceConnection) || (ajp instanceof AJP.SearchEvent) || (ajp instanceof AJP.TextPaint) || (ajp instanceof AJP.UserHandle) || (ajp instanceof AJP.TextWatcher)) {
            return 4L;
        }
        if (!(ajp instanceof AJP.MediaController)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AJP.MediaController) ajp).EZpvd()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AJP ajp, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(ajp, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (ajp instanceof AJP.SizeF) {
            byteBuffer.putInt(1);
        } else if (ajp instanceof AJP.BaseBundle) {
            byteBuffer.putInt(2);
        } else if (ajp instanceof AJP.Theme) {
            byteBuffer.putInt(3);
        } else if (ajp instanceof AJP.NoCopySpan) {
            byteBuffer.putInt(4);
        } else if (ajp instanceof AJP.PersistableBundle) {
            byteBuffer.putInt(5);
        } else if (ajp instanceof AJP.TaskStackBuilder) {
            byteBuffer.putInt(6);
        } else if (ajp instanceof AJP.DragEvent) {
            byteBuffer.putInt(7);
        } else if (ajp instanceof AJP.KeyListener) {
            byteBuffer.putInt(8);
        } else if (ajp instanceof AJP.Cursor) {
            byteBuffer.putInt(9);
        } else if (ajp instanceof AJP.ApplicationInfo) {
            byteBuffer.putInt(10);
        } else if (ajp instanceof AJP.GetChars) {
            byteBuffer.putInt(11);
        } else if (ajp instanceof AJP.Params) {
            byteBuffer.putInt(12);
        } else if (ajp instanceof AJP.ComponentName) {
            byteBuffer.putInt(13);
        } else if (ajp instanceof AJP.Display) {
            byteBuffer.putInt(14);
        } else if (ajp instanceof AJP.ComponentCallbacks) {
            byteBuffer.putInt(15);
        } else if (ajp instanceof AJP.DatabaseErrorHandler) {
            byteBuffer.putInt(16);
        } else if (ajp instanceof AJP.UpdateAppearance) {
            byteBuffer.putInt(17);
        } else if (ajp instanceof AJP.ContextThemeWrapper) {
            byteBuffer.putInt(18);
        } else if (ajp instanceof AJP.Looper) {
            byteBuffer.putInt(19);
        } else if (ajp instanceof AJP.LocaleList) {
            byteBuffer.putInt(20);
        } else if (ajp instanceof AJP.Uri) {
            byteBuffer.putInt(21);
        } else if (ajp instanceof AJP.Rect) {
            byteBuffer.putInt(22);
        } else if (ajp instanceof AJP.IBinder) {
            byteBuffer.putInt(23);
        } else if (ajp instanceof AJP.Callback) {
            byteBuffer.putInt(24);
        } else if (ajp instanceof AJP.Typeface) {
            byteBuffer.putInt(25);
        } else if (ajp instanceof AJP.Handler) {
            byteBuffer.putInt(26);
        } else if (ajp instanceof AJP.TransitionManager) {
            byteBuffer.putInt(27);
        } else if (ajp instanceof AJP.ContentResolver) {
            byteBuffer.putInt(28);
        } else if (ajp instanceof AJP.Context) {
            byteBuffer.putInt(29);
        } else if (ajp instanceof AJP.LayoutInflater) {
            byteBuffer.putInt(30);
        } else if (ajp instanceof AJP.DragAndDropPermissions) {
            byteBuffer.putInt(31);
        } else if (ajp instanceof AJP.Factory2) {
            byteBuffer.putInt(32);
        } else if (ajp instanceof AJP.MenuInflater) {
            byteBuffer.putInt(33);
        } else if (ajp instanceof AJP.DispatcherState) {
            byteBuffer.putInt(34);
        } else if (ajp instanceof AJP.MovementMethod) {
            byteBuffer.putInt(35);
        } else if (ajp instanceof AJP.TransformationMethod) {
            byteBuffer.putInt(36);
        } else if (ajp instanceof AJP.URLSpan) {
            byteBuffer.putInt(37);
        } else if (ajp instanceof AJP.ActionBar) {
            byteBuffer.putInt(38);
        } else if (ajp instanceof AJP.TaskDescription) {
            byteBuffer.putInt(39);
        } else if (ajp instanceof AJP.Size) {
            byteBuffer.putInt(40);
        } else if (ajp instanceof AJP.CharacterStyle) {
            byteBuffer.putInt(41);
        } else if (ajp instanceof AJP.Mode) {
            byteBuffer.putInt(42);
        } else if (ajp instanceof AJP.ContextMenuInfo) {
            byteBuffer.putInt(43);
        } else if (ajp instanceof AJP.SQLiteClosable) {
            byteBuffer.putInt(44);
        } else if (ajp instanceof AJP.Activity) {
            byteBuffer.putInt(45);
        } else if (ajp instanceof AJP.Drawable) {
            byteBuffer.putInt(46);
        } else if (ajp instanceof AJP.PointerIcon) {
            byteBuffer.putInt(47);
        } else if (ajp instanceof AJP.Editable) {
            byteBuffer.putInt(48);
        } else if (ajp instanceof AJP.MenuItem) {
            byteBuffer.putInt(49);
        } else if (ajp instanceof AJP.Canvas) {
            byteBuffer.putInt(50);
        } else if (ajp instanceof AJP.SQLiteDatabase) {
            byteBuffer.putInt(51);
        } else if (ajp instanceof AJP.Bitmap) {
            byteBuffer.putInt(52);
        } else if (ajp instanceof AJP.TypedArray) {
            byteBuffer.putInt(53);
        } else if (ajp instanceof AJP.Parcel) {
            byteBuffer.putInt(54);
        } else if (ajp instanceof AJP.Scene) {
            byteBuffer.putInt(55);
        } else if (ajp instanceof AJP.TruncateAt) {
            byteBuffer.putInt(56);
        } else if (ajp instanceof AJP.MotionEvent) {
            byteBuffer.putInt(57);
        } else if (ajp instanceof AJP.TouchDelegate) {
            byteBuffer.putInt(58);
        } else if (ajp instanceof AJP.FragmentManager) {
            byteBuffer.putInt(59);
        } else if (ajp instanceof AJP.PictureInPictureParams) {
            byteBuffer.putInt(60);
        } else if (ajp instanceof AJP.Spanned) {
            byteBuffer.putInt(61);
        } else if (ajp instanceof AJP.Intent) {
            byteBuffer.putInt(62);
        } else if (ajp instanceof AJP.ContextWrapper) {
            byteBuffer.putInt(63);
        } else if (ajp instanceof AJP.ClipData) {
            byteBuffer.putInt(64);
        } else if (ajp instanceof AJP.CursorFactory) {
            byteBuffer.putInt(65);
        } else if (ajp instanceof AJP.KeyEvent) {
            byteBuffer.putInt(66);
        } else if (ajp instanceof AJP.AssetManager) {
            byteBuffer.putInt(67);
        } else if (ajp instanceof AJP.Property) {
            byteBuffer.putInt(68);
        } else if (ajp instanceof AJP.StateListAnimator) {
            byteBuffer.putInt(69);
        } else if (ajp instanceof AJP.BroadcastReceiver) {
            byteBuffer.putInt(70);
        } else if (ajp instanceof AJP.Point) {
            byteBuffer.putInt(71);
        } else if (ajp instanceof AJP.ContextMenu) {
            byteBuffer.putInt(72);
        } else if (ajp instanceof AJP.AttributeSet) {
            byteBuffer.putInt(73);
        } else if (ajp instanceof AJP.ComponentCallbacks2) {
            byteBuffer.putInt(74);
        } else if (ajp instanceof AJP.ClickableSpan) {
            byteBuffer.putInt(75);
        } else if (ajp instanceof AJP.VoiceInteractor) {
            byteBuffer.putInt(76);
        } else if (ajp instanceof AJP.IntentSender) {
            byteBuffer.putInt(77);
        } else if (ajp instanceof AJP.SparseArray) {
            byteBuffer.putInt(78);
        } else if (ajp instanceof AJP.AssistContent) {
            byteBuffer.putInt(79);
        } else if (ajp instanceof AJP.IntentFilter) {
            byteBuffer.putInt(80);
        } else if (ajp instanceof AJP.Spannable) {
            byteBuffer.putInt(81);
        } else if (ajp instanceof AJP.PendingIntent) {
            byteBuffer.putInt(82);
        } else if (ajp instanceof AJP.Configuration) {
            byteBuffer.putInt(83);
        } else if (ajp instanceof AJP.ColorStateList) {
            byteBuffer.putInt(84);
        } else if (ajp instanceof AJP.PackageManager) {
            byteBuffer.putInt(85);
        } else if (ajp instanceof AJP.Resources) {
            byteBuffer.putInt(86);
        } else if (ajp instanceof AJP.ParcelableSpan) {
            byteBuffer.putInt(87);
        } else if (ajp instanceof AJP.Environment) {
            byteBuffer.putInt(88);
        } else if (ajp instanceof AJP.Dialog) {
            byteBuffer.putInt(89);
        } else if (ajp instanceof AJP.Parcelable) {
            byteBuffer.putInt(90);
        } else if (ajp instanceof AJP.Menu) {
            byteBuffer.putInt(91);
        } else if (ajp instanceof AJP.Creator) {
            byteBuffer.putInt(92);
        } else if (ajp instanceof AJP.Application) {
            byteBuffer.putInt(93);
        } else if (ajp instanceof AJP.Paint) {
            byteBuffer.putInt(94);
        } else if (ajp instanceof AJP.Bundle) {
            byteBuffer.putInt(95);
        } else if (ajp instanceof AJP.SharedElementCallback) {
            byteBuffer.putInt(96);
        } else if (ajp instanceof AJP.Gravity) {
            byteBuffer.putInt(97);
        } else if (ajp instanceof AJP.Matrix) {
            byteBuffer.putInt(98);
        } else if (ajp instanceof AJP.InputEvent) {
            byteBuffer.putInt(99);
        } else if (ajp instanceof AJP.DialogInterface) {
            byteBuffer.putInt(100);
        } else if (ajp instanceof AJP.Factory) {
            byteBuffer.putInt(101);
        } else if (ajp instanceof AJP.Layout) {
            byteBuffer.putInt(102);
        } else if (ajp instanceof AJP.LoaderManager) {
            byteBuffer.putInt(103);
        } else if (ajp instanceof AJP.InputFilter) {
            byteBuffer.putInt(104);
        } else if (ajp instanceof AJP.Fragment) {
            byteBuffer.putInt(105);
        } else if (ajp instanceof AJP.PackageItemInfo) {
            byteBuffer.putInt(106);
        } else if (ajp instanceof AJP.InputType) {
            byteBuffer.putInt(107);
        } else if (ajp instanceof AJP.SharedPreferences) {
            byteBuffer.putInt(108);
        } else if (ajp instanceof AJP.ActionMode) {
            byteBuffer.putInt(109);
        } else if (ajp instanceof AJP.ServiceConnection) {
            byteBuffer.putInt(WalletImportError.ERROR_CODE_AA_CREATE_KEY);
        } else if (ajp instanceof AJP.SearchEvent) {
            byteBuffer.putInt(WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY);
        } else if (ajp instanceof AJP.TextPaint) {
            byteBuffer.putInt(WalletImportError.ERROR_CODE_AA_EXIST);
        } else if (ajp instanceof AJP.UserHandle) {
            byteBuffer.putInt(WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST);
        } else if (ajp instanceof AJP.TextWatcher) {
            byteBuffer.putInt(114);
        } else {
            if (!(ajp instanceof AJP.MediaController)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(115);
            FfiConverterString.INSTANCE.write(((AJP.MediaController) ajp).EZpvd(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}

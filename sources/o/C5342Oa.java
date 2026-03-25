package o;

import android.provider.ContactsContract;

/* JADX INFO: renamed from: o.Oa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5342Oa extends AbstractC5346Oe<java.io.InputStream> {
    public static final android.content.UriMatcher KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.NU
    public java.lang.Class<java.io.InputStream> KWHzl() {
        return java.io.InputStream.class;
    }

    static {
        android.content.UriMatcher uriMatcher = new android.content.UriMatcher(-1);
        KWHzl = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public C5342Oa(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        super(contentResolver, uri);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/net/Uri;Landroid/content/ContentResolver;)Ljava/lang/Object; */
    @Override // o.AbstractC5346Oe
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.io.InputStream KWHzl(android.net.Uri uri, android.content.ContentResolver contentResolver) throws java.io.FileNotFoundException {
        java.io.InputStream inputStreamOLrzqt = OLrzqt(uri, contentResolver);
        if (inputStreamOLrzqt != null) {
            return inputStreamOLrzqt;
        }
        throw new java.io.FileNotFoundException("InputStream is null for " + uri);
    }

    public final java.io.InputStream OLrzqt(android.net.Uri uri, android.content.ContentResolver contentResolver) throws java.io.FileNotFoundException {
        int iMatch = KWHzl.match(uri);
        if (iMatch != 1) {
            if (iMatch == 3) {
                return KWHzl(contentResolver, uri);
            }
            if (iMatch != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        android.net.Uri uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uriLookupContact == null) {
            throw new java.io.FileNotFoundException("Contact cannot be found");
        }
        return KWHzl(contentResolver, uriLookupContact);
    }

    public final java.io.InputStream KWHzl(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
    @Override // o.AbstractC5346Oe
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(java.io.InputStream inputStream) throws java.io.IOException {
        inputStream.close();
    }
}

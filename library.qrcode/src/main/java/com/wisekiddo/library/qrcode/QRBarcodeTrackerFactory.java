
package com.wisekiddo.library.qrcode;

import android.content.Context;

import com.google.android.gms.vision.MultiProcessor;
import com.google.android.gms.vision.Tracker;
import com.google.android.gms.vision.barcode.Barcode;

/**
 * Created by ronald bernardo on 29/11/17.
 */

/**
 * Factory for creating a tracker and associated graphic to be associated with a new barcode.  The
 * multi-processor uses this factory to create barcode trackers as needed -- one for each barcode.
 */
public class QRBarcodeTrackerFactory implements MultiProcessor.Factory<Barcode> {
    private Context mContext;

    public QRBarcodeTrackerFactory(Context context) {
        mContext = context;
    }

    @Override
    public Tracker<Barcode> create(Barcode barcode) {
        return new QRBarcodeTracker(mContext);
    }
}
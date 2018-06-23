package moirapp.exoff;

import android.media.ExifInterface;
import android.util.Log;

import java.io.IOException;

/**
 * Created by mariote on 25/2/18.
 */

public class MetadataManager {

    private String imagePath;
    private ExifInterface e;

    public MetadataManager(String path) {
        this.imagePath = path;
    }

    public void eraseMetadata() throws IOException {
        try {
            e = new ExifInterface(imagePath);
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        Log.d("Apertura: ", ExifInterface.TAG_DATETIME);

        e.setAttribute(ExifInterface.TAG_APERTURE_VALUE, "3,2");
        e.setAttribute(ExifInterface.TAG_ARTIST, null);
        e.setAttribute(ExifInterface.TAG_BITS_PER_SAMPLE,null);
        e.setAttribute(ExifInterface.TAG_BRIGHTNESS_VALUE,null);
        e.setAttribute(ExifInterface.TAG_CFA_PATTERN ,null);
        e.setAttribute(ExifInterface.TAG_COLOR_SPACE ,null);
        e.setAttribute(ExifInterface.TAG_COMPONENTS_CONFIGURATION ,null);
        e.setAttribute(ExifInterface.TAG_COMPRESSED_BITS_PER_PIXEL ,null);
        e.setAttribute(ExifInterface.TAG_COMPRESSION ,null);
        e.setAttribute(ExifInterface.TAG_CONTRAST ,null);
        e.setAttribute(ExifInterface.TAG_COPYRIGHT ,"Mariotepro");
        e.setAttribute(ExifInterface.TAG_CUSTOM_RENDERED ,null);
        e.setAttribute(ExifInterface.TAG_DATETIME ,null);
        e.setAttribute(ExifInterface.TAG_DATETIME_DIGITIZED ,null);
        e.setAttribute(ExifInterface.TAG_DATETIME_ORIGINAL ,null);
        e.setAttribute(ExifInterface.TAG_DEVICE_SETTING_DESCRIPTION ,null);
        e.setAttribute(ExifInterface.TAG_DIGITAL_ZOOM_RATIO ,null);
        e.setAttribute(ExifInterface.TAG_EXIF_VERSION ,null);
        e.setAttribute(ExifInterface.TAG_EXPOSURE_BIAS_VALUE ,null);
        e.setAttribute(ExifInterface.TAG_EXPOSURE_INDEX ,null);
        e.setAttribute(ExifInterface.TAG_EXPOSURE_MODE ,null);
        e.setAttribute(ExifInterface.TAG_EXPOSURE_PROGRAM ,null);
        e.setAttribute(ExifInterface.TAG_EXPOSURE_TIME ,null);
        e.setAttribute(ExifInterface.TAG_F_NUMBER ,null);
        e.setAttribute(ExifInterface.TAG_FILE_SOURCE ,null);
        e.setAttribute(ExifInterface.TAG_FLASH ,null);
        e.setAttribute(ExifInterface.TAG_FLASH_ENERGY ,null);
        e.setAttribute(ExifInterface.TAG_FLASHPIX_VERSION ,null);
        e.setAttribute(ExifInterface.TAG_FOCAL_LENGTH ,null);
        e.setAttribute(ExifInterface.TAG_FOCAL_LENGTH_IN_35MM_FILM ,null);
        e.setAttribute(ExifInterface.TAG_FOCAL_PLANE_RESOLUTION_UNIT ,null);
        e.setAttribute(ExifInterface.TAG_FOCAL_PLANE_X_RESOLUTION ,null);
        e.setAttribute(ExifInterface.TAG_FOCAL_PLANE_Y_RESOLUTION ,null);
        e.setAttribute(ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT ,null);
        e.setAttribute(ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT_LENGTH ,null);
        e.setAttribute(ExifInterface.TAG_GAIN_CONTROL ,null);
        e.setAttribute(ExifInterface.TAG_GPS_ALTITUDE ,null);
        e.setAttribute(ExifInterface.TAG_GPS_ALTITUDE_REF ,null);
        e.setAttribute(ExifInterface.TAG_GPS_AREA_INFORMATION ,null);
        e.setAttribute(ExifInterface.TAG_GPS_DATESTAMP ,null);
        e.setAttribute(ExifInterface.TAG_GPS_DEST_BEARING ,null);
        e.setAttribute(ExifInterface.TAG_GPS_DEST_BEARING_REF ,null);
        e.setAttribute(ExifInterface.TAG_GPS_DEST_DISTANCE ,null);
        e.setAttribute(ExifInterface.TAG_GPS_DEST_DISTANCE_REF ,null);
        e.setAttribute(ExifInterface.TAG_GPS_DEST_LATITUDE ,null);
        e.setAttribute(ExifInterface.TAG_GPS_DEST_LATITUDE_REF ,null);
        e.setAttribute(ExifInterface.TAG_GPS_DEST_LONGITUDE ,null);
        e.setAttribute(ExifInterface.TAG_GPS_DEST_LONGITUDE_REF ,null);
        e.setAttribute(ExifInterface.TAG_GPS_LONGITUDE ,null);
        e.setAttribute(ExifInterface.TAG_GPS_LONGITUDE_REF ,null);
        e.setAttribute(ExifInterface.TAG_GPS_LATITUDE ,null);
        e.setAttribute(ExifInterface.TAG_GPS_LATITUDE_REF ,null);
        e.setAttribute(ExifInterface.TAG_GPS_DIFFERENTIAL ,null);
        e.setAttribute(ExifInterface.TAG_GPS_DOP ,null);
        e.setAttribute(ExifInterface.TAG_GPS_IMG_DIRECTION ,null);
        e.setAttribute(ExifInterface.TAG_GPS_IMG_DIRECTION_REF ,null);
        e.setAttribute(ExifInterface.TAG_GPS_MAP_DATUM ,null);
        e.setAttribute(ExifInterface.TAG_GPS_MEASURE_MODE ,null);
        e.setAttribute(ExifInterface.TAG_GPS_PROCESSING_METHOD ,null);
        e.setAttribute(ExifInterface.TAG_GPS_SATELLITES ,null);
        e.setAttribute(ExifInterface.TAG_GPS_SPEED ,null);
        e.setAttribute(ExifInterface.TAG_GPS_SPEED_REF ,null);
        e.setAttribute(ExifInterface.TAG_GPS_STATUS ,null);
        e.setAttribute(ExifInterface.TAG_GPS_TIMESTAMP ,null);
        e.setAttribute(ExifInterface.TAG_GPS_TRACK ,null);
        e.setAttribute(ExifInterface.TAG_GPS_TRACK_REF ,null);
        e.setAttribute(ExifInterface.TAG_GPS_VERSION_ID ,null);
        e.setAttribute(ExifInterface.TAG_IMAGE_DESCRIPTION ,null);
        e.setAttribute(ExifInterface.TAG_IMAGE_LENGTH ,null);
        e.setAttribute(ExifInterface.TAG_IMAGE_UNIQUE_ID ,null);
        e.setAttribute(ExifInterface.TAG_IMAGE_WIDTH ,null);
        e.setAttribute(ExifInterface.TAG_INTEROPERABILITY_INDEX ,null);
        e.setAttribute(ExifInterface.TAG_ISO_SPEED_RATINGS ,null);
        e.setAttribute(ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT ,null);
        e.setAttribute(ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT_LENGTH ,null);
        e.setAttribute(ExifInterface.TAG_LIGHT_SOURCE ,null);
        e.setAttribute(ExifInterface.TAG_MAKE ,null);
        e.setAttribute(ExifInterface.TAG_MAKER_NOTE ,null);
        e.setAttribute(ExifInterface.TAG_MAX_APERTURE_VALUE ,null);
        e.setAttribute(ExifInterface.TAG_METERING_MODE ,null);
        e.setAttribute(ExifInterface.TAG_MODEL ,null);
        e.setAttribute(ExifInterface.TAG_OECF ,null);
        e.setAttribute(ExifInterface.TAG_PRIMARY_CHROMATICITIES ,null);
        e.setAttribute(ExifInterface.TAG_REFERENCE_BLACK_WHITE ,null);
        e.setAttribute(ExifInterface.TAG_RELATED_SOUND_FILE ,null);
        e.setAttribute(ExifInterface.TAG_RESOLUTION_UNIT ,null);
        e.setAttribute(ExifInterface.TAG_ROWS_PER_STRIP ,null);
        e.setAttribute(ExifInterface.TAG_SAMPLES_PER_PIXEL ,null);
        e.setAttribute(ExifInterface.TAG_SATURATION ,null);
        e.setAttribute(ExifInterface.TAG_SCENE_CAPTURE_TYPE ,null);
        e.setAttribute(ExifInterface.TAG_SCENE_TYPE ,null);
        e.setAttribute(ExifInterface.TAG_SENSING_METHOD ,null);
        e.setAttribute(ExifInterface.TAG_SHARPNESS ,null);
        e.setAttribute(ExifInterface.TAG_SHUTTER_SPEED_VALUE ,null);
        e.setAttribute(ExifInterface.TAG_SOFTWARE ,null);
        e.setAttribute(ExifInterface.TAG_SPATIAL_FREQUENCY_RESPONSE ,null);
        e.setAttribute(ExifInterface.TAG_SPECTRAL_SENSITIVITY ,null);
        e.setAttribute(ExifInterface.TAG_STRIP_BYTE_COUNTS ,null);
        e.setAttribute(ExifInterface.TAG_STRIP_OFFSETS ,null);
        e.setAttribute(ExifInterface.TAG_SUBJECT_AREA ,null);
        e.setAttribute(ExifInterface.TAG_SUBJECT_DISTANCE ,null);
        e.setAttribute(ExifInterface.TAG_SUBJECT_DISTANCE_RANGE ,null);
        e.setAttribute(ExifInterface.TAG_SUBJECT_LOCATION ,null);
        e.setAttribute(ExifInterface.TAG_SUBSEC_TIME ,null);
        e.setAttribute(ExifInterface.TAG_SUBSEC_TIME_DIGITIZED ,null);
        e.setAttribute(ExifInterface.TAG_SUBSEC_TIME ,null);
        e.setAttribute(ExifInterface.TAG_SUBSEC_TIME_DIGITIZED ,null);
        e.setAttribute(ExifInterface.TAG_SUBSEC_TIME_ORIGINAL ,null);
        e.setAttribute(ExifInterface.TAG_THUMBNAIL_IMAGE_LENGTH ,null);
        e.setAttribute(ExifInterface.TAG_THUMBNAIL_IMAGE_WIDTH ,null);
        e.setAttribute(ExifInterface.TAG_TRANSFER_FUNCTION ,null);
        e.setAttribute(ExifInterface.TAG_USER_COMMENT ,null);
        e.setAttribute(ExifInterface.TAG_WHITE_BALANCE ,null);
        e.setAttribute(ExifInterface.TAG_WHITE_POINT ,null);
        e.setAttribute(ExifInterface.TAG_X_RESOLUTION ,null);
        e.setAttribute(ExifInterface.TAG_Y_RESOLUTION ,null);
        e.setAttribute(ExifInterface.TAG_Y_CB_CR_COEFFICIENTS ,null);
        e.setAttribute(ExifInterface.TAG_Y_CB_CR_POSITIONING ,null);
        e.setAttribute(ExifInterface.TAG_Y_CB_CR_SUB_SAMPLING ,null);

        try {
            e.saveAttributes();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        Log.d("Apertura2: ", ExifInterface.TAG_APERTURE_VALUE);
    }
}

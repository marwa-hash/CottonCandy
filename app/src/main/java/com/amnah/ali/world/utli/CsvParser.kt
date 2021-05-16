package com.amnah.ali.world.utli


import com.amnah.ali.world.data.domain.City

class CsvParser {
    fun parse(line : String) : City{
        val tokens = line.split(",")
        return City(
            city = tokens[Constants.ColumnIndex.CITY]
            city_ascii = tokens[Constants.ColumnIndex.CITY_ASCII]
            lat  = tokens[Constants.ColumnIndex.LAT].toDouble()
            lng   = tokens[Constants.ColumnIndex.CITY].toDouble()
            country   = tokens[Constants.ColumnIndex.COUNTRY]
            iso2  = tokens[Constants.ColumnIndex.ISO2]
            iso3 = tokens[Constants.ColumnIndex.ISO3]
            admin_name  = tokens[Constants.ColumnIndex.ADMIN_NAME]
            capital  = tokens[Constants.ColumnIndex.CAPITAL]
            population  = tokens[Constants.ColumnIndex.POPULATION].toLong()
            id = tokens[Constants.ColumnIndex.ID].toLong()

        )
    }
}